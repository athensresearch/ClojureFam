(ns clojurefam.sandbox.teodorlu.solutions
  (:require [clojurefam.koan :as koan :refer [defsolution]]
            [clojurefam.db :as db]
            [clojurefam.sandbox.teodorlu.tasks :as tasks]))

(comment
  (db/pull '[*] [:koan/id ::tasks/conj-1])
  ;; => {:db/id 1,
  ;;     :koan/check #function[clojurefam.sandbox.teodorlu.tasks/eval17863/fn--17864],
  ;;     :koan/id :clojurefam.sandbox.teodorlu.tasks/conj-1,
  ;;     :koan/problem (= #{1 4 3 2} (conj #{1 4 3} __))}

  ;; How do we turn that into a solution?

  (koan/help ::tasks/conj-1)
  ;; => #:koan{:id :clojurefam.sandbox.teodorlu.tasks/conj-1,
  ;;           :problem (= #{1 4 3 2} (conj #{1 4 3} __)),
  ;;           :start-with (defsolution :clojurefam.sandbox.teodorlu.tasks/conj-1 '...)}
  )

(defsolution ::tasks/conj-1
  2)
;; => #:clojurefam.koan{:result :pass}
