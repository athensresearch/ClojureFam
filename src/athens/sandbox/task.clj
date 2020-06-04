(ns athens.sandbox.task
  (:refer-clojure :exclude [def]))

(defonce tasks (atom {}))

(comment
  (reset! tasks {})

  @tasks
  )

(defn register!* [namespace task-id task]
  (assert (contains? task :problem))
  (assert (contains? task :check))
  (let [ns-sym (-> namespace str symbol)]
    (swap! tasks update-in [ns-sym task-id] conj task)))

(defmacro def [task-id body]
  `(register!* *ns* ~task-id ~body))
