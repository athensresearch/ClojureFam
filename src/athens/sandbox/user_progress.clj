(ns athens.sandbox.user-progress
  (:require [spicerack.core :as db]))

;; Statefully keep track of the user's progress

(def ^:dynamic *user-db-path* "./clojurefam-user.db")

(def ^:dynamic *progress-map-name* "progress")

;; Bug: crashes when using `doall` on stuff that is not a sequence.
(defn fmap [f]
  (with-open [db (db/open-database *user-db-path*)]
    (let [progress (db/open-hashmap db *progress-map-name*)]
      (let [result (f progress)]
        (if (seq? result)
          ;; Must realize lazy sequences before closing the connection
          (doall result)
          result)))))

(comment
  (fmap keys)
  (fmap (fn [db]
          (db/assoc! db :name "Teodor")))

  (fmap #(type %))

  (doall [1])
  )

;; or -- should we stick to datascript? Just persist it after writes?
;; or we could just treat it as an append-only log.

(comment
  :clojurefam.datascript/query-1 {:solution '(...) :done true}
  )
