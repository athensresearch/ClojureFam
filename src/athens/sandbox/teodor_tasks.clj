(ns athens.sandbox.teodor-tasks
  (:require [athens.sandbox.task :as task]))

;; Source: http://www.4clojure.com/problem/9
(task/def :conj-1
  {:problem '(= #{1 2 3 4} (conj #{1 4 3} __))
   :check (fn [solution]
            (= #{1 2 3 4} (conj #{1 4 3} solution)))})

;; Source: http://www.4clojure.com/problem/10
(task/def :maps-1
  {:problem '(and
              (= __ ((hash-map :a 10, :b 20, :c 30) :b))
              (= __ (:b {:a 10, :b 20, :c 30})))
   :check (fn [solution]
            (and
             (= solution ((hash-map :a 10, :b 20, :c 30) :b))
             (= solution (:b {:a 10, :b 20, :c 30}))))})

