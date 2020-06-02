(ns ^{:doc "Descriptions of and exercises for Clojure's expansive list of standard library functions that operate on or create sequences"})

;; Creating a Lazy Seq from a collection

;; seq

(seq coll)

;; Returns a seq on the collection

;; If collection is empty, returns `nil`

;; `(seq nil)` also returns `nil`

;; Works on lists, vectors, sets, strings, and any Java objects that implement Iterable

;; WARNING seqs cache values, so do not use seq on any Iterable with an iterator that repeatedly returns the same mutable object

;; Exercises

(defn all-collections-not-empty? [colls]
  ;; Your code here
  )

(assert (= true  (all-collections-not-empty? ["1" [1] '(1) {:1 1} #{1}])))
(assert (= false (all-collections-not-empty? [[1 2] '(3 4) "5" #{}])))

