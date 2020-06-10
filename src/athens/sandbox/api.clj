(ns ^{:doc "End-user API expected to be exposed to learners in the REPL"}
    athens.sandbox.api
  (:require [athens.sandbox.user-state :as state]
            [athens.sandbox.task :as task]))

(comment
  ;; Help is non-essential
  (defn help
    ([]
     "Welcome to ClojureFam!

    This is your very own sandbox for learning what Clojure you need to know in
    order to contribute to Athens. It also works as a training grounds.

    Quickstart:

    1. Load a namespace with tasks, like

         (require 'athens.sandbox.teodor-tasks)

    2. Check what tasks are available:

         (athens/available-tracks)

    3. Set the track you want to start working on:

         ()
"
     ))
  )

(def set-current-track!
  )

(defn available-tracks []
  (keys @task/tasks))

(comment
  (available-tracks)
  )

;; Can we call help on tracks?

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; With mutable local state tracking user progress

(defn set-track!
  "Set the current learning track. Options: :koans, :datascript, :reagent-from-scratch"
  [track]
  (assert (contains? @task/tasks track))
  (state/set-current-track! track))

(defn current []
  []
  (state/current))


(defn set-task!
  [task]
  (assert (contains? (get @task/tasks (:track (current)))
                     task))
  (state/set-current-task! task))

(comment
  (current)

  ;; No tasks should be loaded
  @task/tasks

  ;; Can't set track without the "track loaded"
  (require 'athens.sandbox.teodor-tasks)

  ;; Some tasks should be loaded
  @task/tasks

  ;; Set track, works
  (set-track! 'athens.sandbox.teodor-tasks)

  (set-task! :conj-2)
  ;; BOOM, file locking issue. Not sure how to proceed.
  ;; Looking at athens.sandbox.user-state/fmap might be useful, that handles
  ;; opening and closing connections.
  (set-task! :conj-1)

  )

(defn submit-current! [solution])

(defn status
  "Get a status on where you are"
  []
  {:current {:track :some-track-id
             :task :some-task-id}
   :progress {'athens.sandbox.seqs :something}
   })


(the-ns 'athens.sandbox.api)

(defn current-track [])

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Work with any problem on any track

(defn task [track problem])

(defn submit [track problem solution])

(defn task
  "Get a task (2-arity), next task on track (1-arity) or next task on current track (0-arity)"
  ([] #_ "current task on current track")
  ([track] #_ "current task on track")
  ([track task] #_ "task on track"))
