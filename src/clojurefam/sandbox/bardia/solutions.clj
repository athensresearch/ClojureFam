(ns clojurefam.sandbox.bardia.solutions
  (:require [clojurefam.koan :as koan :refer [defsolution]]
            [clojurefam.db :as db]
            [clojurefam.sandbox.bardia.tasks :as tasks]))

(db/pull '[*] [:koan/id ::tasks/two-sum])

(defn two-sum
  {:doc "One-pass hash table"}
  [nums target]
  (loop [ht {}
         i 0]
    (if (contains? ht (- target (nums i)))
      [(ht (- target (nums i))) i]
      (recur (assoc ht (nums i) i) (inc i)))))

(defsolution ::tasks/two-sum two-sum)
;; => #:clojurefam.koan{:result :pass}
