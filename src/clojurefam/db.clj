(ns clojurefam.db
  (:require [datascript.core :as d]))

(def task-schema {:koan/problem {}
                  :koan/check {}
                  :koan/id {:db/unique :db.unique/identity}})

(def solution-schema {})

(def schema (merge task-schema solution-schema))

(def conn (d/create-conn schema))

(comment
  ;; Reset db
  (alter-var-root #'conn (fn [_] (d/create-conn schema)))

  @conn
  )

(defn q [query & inputs]
  (apply d/q query @conn inputs))

(defn transact!
  ([tx-data]
   (d/transact! conn tx-data))
  ([tx-data tx-meta]
   (d/transact! conn tx-data tx-meta)))

(defn pull [selector eid]
  (d/pull @conn selector eid))

(defn pull-many [selector eids]
  (d/pull-many @conn selector eids))

(defn entity [eid]
  (d/entity @conn eid))

(comment
  (q '[:find [(pull ?e [:task/id]) ...]
       :where [?e :koan/id]])

  (q '[:find ?e
       :where [?e :koan/id]])

  (d/q  '[:find ?e
          :where [?e :koan/id]]
        @conn)
  )
