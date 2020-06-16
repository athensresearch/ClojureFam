(ns athens.sandbox.task
  (:require [datascript.core :as d]
            [clojure.spec.alpha :as s])
  (:refer-clojure :exclude [def]))

(defonce tasks (atom {}))

(comment
  (reset! tasks {})

  @tasks
  )

#_
(defn register!* [namespace task-id task]
  (assert (contains? task :problem))
  (assert (contains? task :check))
  (let [ns-sym (-> namespace str symbol)]
    (swap! tasks update-in [ns-sym task-id] conj task)))



(s/def :task/problem any?)
(s/def :task/check ifn?)
(s/def :task/id keyword?)

(s/def ::task
  (s/keys :req [:task/problem :task/check :task/id]))

(defn register!* [task-id task]
  (let [task (assoc task :task/id task-id)]
    (s/assert ::task task)
    
    )
  )

#_
(defmacro def [task-id body]
  `(register!* *ns* ~task-id ~body))
