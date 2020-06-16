(ns clojurefam.db
  (:require [datascript.core :as d]))

(def task-schema {:task/problem {}
                  :task/check {}
                  :task/id {:db/unique :db.unique/identity}})

(def solution-schema {})

(def schema (merge task-schema solution-schema))

(def conn (d/create-conn schema))

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

(comment
  (q '[:find [(pull ?e [:task/id]) ...]
       :where [?e :task/id]])

  (q '[:find ?e
       :where [?e :task/id]])

  (d/q  '[:find ?e
          :where [?e :task/id]]
        @conn)
  )
