(ns clojurefam.task
  (:refer-clojure :exclude [def])
  (:require [clojure.spec.alpha :as s]
            [clojurefam.db :as db]))

;; Hmm, vi burde egentlig ikke ha spec her.

(s/def :task/problem any?)
(s/def :task/check ifn?)
(s/def :task/id keyword?)

(s/def ::task
  (s/keys :req [:task/problem :task/check :task/id]))

(defn register!* [task-id task]
  (let [task (assoc task :task/id task-id)]
    (s/assert ::task task)
    (db/transact! [task])))

(defmacro def [task-id body]
  `(register!* ~task-id ~body))

;; Don't really need a macro, but it acts like a normal def.
