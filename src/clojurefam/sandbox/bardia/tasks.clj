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


(defkoan ::max-profit
  {:koan/problem '(and
                   (= 5 (__ [7 1 5 3 6 4]))
                   (= 0 (__ [7 6 4 3 1])))
   :koan/check (fn [solution]
                 (= 5 (solution [7 1 5 3 6 4]))
                 (= 0 (solution [7 6 4 3 1])))
   :koan/description "Say you have an array for which the ith element is the price of a given stock on day i. If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit. Note that you cannot sell a stock before you buy one."})


(defkoan ::is-anagram
  {:koan/problem '(and
                   (= true  (__ "anagram" "nagaram"))
                   (= false (__ "rat" "car")))
   :koan/check (fn [solution]
                 (= true  (solution "anagram" "nagaram"))
                 (= false (solution "rat" "car")))
   :koan/description "Given two strings, determine if they are anagrams of each other"})


(defkoan ::valid-parens?
  {:koan/problem '(and
                   (true?  (__ "()"))
                   (true?  (__ "()[]{}"))
                   (false? (__ "(["))
                   (false? (__ "([)]"))
                   (true?  (__ "{[()]}")))
   :koan/check (fn [solution]
                 (and
                  (true?  (solution "()"))
                  (true?  (solution "()[]{}"))
                  (false? (solution "(["))
                  (false? (solution "([)]"))
                  (true?  (solution "{[()]}"))))
   :koan/description "Given a string containing just the character:
         '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

         An input string is valid if:
         - Open brackets must be closed by the same type of brackets.
         - Open brackets must be closed in the correct order.

         An empty string is also considered valid."})

