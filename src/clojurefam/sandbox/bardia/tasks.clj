(ns clojurefam.sandbox.bardia.tasks
  (:require [clojurefam.koan :as koan :refer [defkoan]]
            [clojurefam.db :as db]))

;; Source https://leetcode.com/problems/two-sum/
(defkoan ::two-sum
  {:koan/problem '(and
                   (= [0 1] (__ [2 7 11 15] 9))
                   (= [2 3] (__ [1 2 3 4] 7)))
   :koan/check (fn [solution]
                 (and
                  (= [0 1] (solution [2 7 11 15] 9))
                  (= [2 3] (solution [1 2 3 4] 7))))
   :koan/description "Given an array of integers, return the indices of the two numbers such that they add up to a specific target. Assume each input has exactly one solution."})

(defkoan ::contains-duplicate
  {:koan/problem '(and
                   (= true  (__ [1 2 3 1]))
                   (= false (__ [1 2 3 4]))
                   (= true  (__ [1 1 1 3 3 4 3 2 4 1])))
   :koan/check (fn [solution]
                 (= true  (solution [1 2 3 1]))
                 (= false (solution [1 2 3 4]))
                 (= true  (solution [1 1 1 3 3 4 3 2 4 1])))
   :koan/description "Given an array of integers, find if the array contains any duplicates"})
