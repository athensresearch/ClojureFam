(ns ^{:doc "End-user API expected to be exposed to learners in the REPL"}
    athens.sandbox.api)

(defn help
  ([]
   "Welcome to ClojureFam!"
   ))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; With mutable local state tracking user progress

(defn set-track!
  "Set the current learning track. Options: :koans, :datascript, :reagent-from-scratch"
  [track])

(defn next-task
  "Next task on current track"
  [])

(defn submit-current! [solution])

(defn skip-current!)

(defn )


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Work with any problem on any track

(defn task [track problem])

(defn submit [track problem solution])

(defn task
  "Get a task (2-arity), next task on track (1-arity) or next task on current track (0-arity)"
  ([track problem])

  )
