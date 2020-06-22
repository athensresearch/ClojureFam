(ns clojurefam.koan
  (:refer-clojure :exclude [def])
  (:require [clojure.spec.alpha :as s]
            [clojurefam.db :as db]))

(s/def :koan/problem any?)
(s/def :koan/check ifn?)
(s/def :koan/description string?)
(s/def :koan/id keyword?)

(s/def ::koan
  (s/keys :req [:koan/problem :koan/check :koan/id]))

(defn register!* [koan-id koan]
  (let [koan (assoc koan :koan/id koan-id)]
    (s/assert ::koan koan)
    (db/transact! [koan])))

(defmacro defkoan [koan-id body]
  `(register!* ~koan-id ~body))

(defn check-koan [koan-id solution]
  (if-let [check-fn (:koan/check (db/entity [:koan/id koan-id]))]
    (let [pass (check-fn solution)]
      (if pass
        {::result :pass}
        {::result :fail}))
    {::error :koan-not-found}))

(defmacro defsolution [koan-id body]
  `(check-koan ~koan-id ~body))

(defn help [koan-id]
  (assoc (db/pull [:koan/id :koan/problem]
                  [:koan/id koan-id])
         :koan/start-with
         `(~'defsolution ~koan-id
           '...)))
