(ns clojurefam.sandbox.teodorlu.tasks
  (:require [clojurefam.task :as task]
            [clojurefam.db :as db]))


;; Source: http://www.4clojure.com/problem/9
(task/def ::conj-1
  {:task/problem '(= #{1 2 3 4} (conj #{1 4 3} __))
   :task/check (fn [solution]
                 (= #{1 2 3 4} (conj #{1 4 3} solution)))})

;; Source: http://www.4clojure.com/problem/10
(task/def ::maps-1
  {:task/problem '(and
                   (= __ ((hash-map :a 10, :b 20, :c 30) :b))
                   (= __ (:b {:a 10, :b 20, :c 30})))
   :task/check (fn [solution]
                 (and
                  (= solution ((hash-map :a 10, :b 20, :c 30) :b))
                  (= solution (:b {:a 10, :b 20, :c 30}))))})

(comment
  (db/pull '[*] [:task/id ::conj-1])
  ;; => {:db/id 1,
  ;;     :task/check #function[clojurefam.sandbox.teodorlu.tasks/eval17861/fn--17862],
  ;;     :task/id :clojurefam.sandbox.teodorlu.tasks/conj-1,
  ;;     :task/problem (= #{1 4 3 2} (conj #{1 4 3} __))}

  (db/pull '[:task/problem] [:task/id ::conj-1])
  ;; => #:task{:problem (= #{1 4 3 2} (conj #{1 4 3} __))}

  )
