(ns clojurefam.sandbox.teodorlu.tasks
  (:require [clojurefam.koan :as koan :refer [defkoan]]
            [clojurefam.db :as db]))

;; Source: http://www.4clojure.com/problem/9
(defkoan ::conj-1
  {:koan/problem '(= #{1 2 3 4} (conj #{1 4 3} __))
   :koan/check (fn [solution]
                 (= #{1 2 3 4} (conj #{1 4 3} solution)))})

;; Source: http://www.4clojure.com/problem/10
(defkoan ::maps-1
  {:koan/problem '(and
                   (= __ ((hash-map :a 10, :b 20, :c 30) :b))
                   (= __ (:b {:a 10, :b 20, :c 30})))
   :koan/check (fn [solution]
                 (and
                  (= solution ((hash-map :a 10, :b 20, :c 30) :b))
                  (= solution (:b {:a 10, :b 20, :c 30}))))})

;; By ghosttoaster|cimara on Discord Slack
(defkoan ::smallest-non-negative-not-present
  {:koan/problem '(= ( __ '(3 1 4 1 5 9 2 6 5 3 5 8 9 7 9 0))  10)
   :koan/check (fn [solve]
                 (= (solve '(3 1 4 1 5 9 2 6 5 3 5 8 9 7 9 0)) 10))})

(comment
  (let [solve (fn [blacklist] (first (remove (set blacklist) (range))))
        check (:koan/check (db/entity [:koan/id ::smallest-non-negative-not-present]))]
    (check solve))

  )

(comment
  (db/pull '[*] [:koan/id ::conj-1])
  ;; => {:db/id 1,
  ;;     :koan/check #function[clojurefam.sandbox.teodorlu.koan/eval17861/fn--17862],
  ;;     :koan/id :clojurefam.sandbox.teodorlu.koan/conj-1,
  ;;     :koan/problem (= #{1 4 3 2} (conj #{1 4 3} __))}

  (db/pull '[:koan/problem] [:koan/id ::conj-1])
  ;; => #:koan{:problem (= #{1 4 3 2} (conj #{1 4 3} __))}

  (db/pull '[:koan/problem] [:koan/id ::smallest-non-negative-not-present])

  (db/entity [:koan/id ::smallest-non-negative-not-present])

  (let [solve (fn [x])
        check (:koan/check (db/entity [:koan/id ::smallest-non-negative-not-present]))]
    (check solve))



  )
