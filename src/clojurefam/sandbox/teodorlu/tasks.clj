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

;; By ghosttoaster|cimara on Discord Slack
(task/def ::smallest-non-negative-not-present
  {:task/problem '(= ( __ '(3 1 4 1 5 9 2 6 5 3 5 8 9 7 9 0))  10)
   :task/check (fn [solve]
                 (= (solve '(3 1 4 1 5 9 2 6 5 3 5 8 9 7 9 0)) 10))})

(comment
  (let [solve (fn [blacklist] (first (remove (set blacklist) (range))))
        check (:task/check (db/entity [:task/id ::smallest-non-negative-not-present]))]
    (check solve))

  )

(comment
  (db/pull '[*] [:task/id ::conj-1])
  ;; => {:db/id 1,
  ;;     :task/check #function[clojurefam.sandbox.teodorlu.tasks/eval17861/fn--17862],
  ;;     :task/id :clojurefam.sandbox.teodorlu.tasks/conj-1,
  ;;     :task/problem (= #{1 4 3 2} (conj #{1 4 3} __))}

  (db/pull '[:task/problem] [:task/id ::conj-1])
  ;; => #:task{:problem (= #{1 4 3 2} (conj #{1 4 3} __))}

  (db/pull '[:task/problem] [:task/id ::smallest-non-negative-not-present])

  (db/entity [:task/id ::smallest-non-negative-not-present])

  (let [solve (fn [x])
        check (:task/check (db/entity [:task/id ::smallest-non-negative-not-present]))]
    (check solve))

  )
