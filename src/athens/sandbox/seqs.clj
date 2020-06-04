(ns ^{:doc "Descriptions of and exercises for Clojure's expansive list of standard library functions that operate on or create sequences"}
    athens.sandbox.seqs)

;; Creating a Lazy Seq from a collection

;; seq

(seq "coll")

;; Returns a seq on the collection

;; If collection is empty, returns `nil`

;; `(seq nil)` also returns `nil`

;; Works on lists, vectors, maps, sets, strings, and any Java objects that implement Iterable

;; WARNING seqs cache values, so do not use seq on any Iterable with an iterator that repeatedly returns the same mutable object


(type (seq {:a 1}))
;; => clojure.lang.PersistentArrayMap$Seq
(type (seq '(:a 1)))
;; => clojure.lang.PersistentList
(type (seq [1 2]))
;; => clojure.lang.PersistentVector$ChunkedSeq
(type (seq "123"))
;; => clojure.lang.StringSeq
(type (seq #{1 2 3}))
;; => clojure.lang.APersistentMap$KeySeq

;; Exercises

(defn all-collections-not-empty?
  {:test #(do
            (assert (= true  (all-collections-not-empty? ["1" [1] '(1) {:1 1} #{1}])))
            (assert (= false (all-collections-not-empty? [[1 2] '(3 4) "5" #{}]))))}
  [colls]
  (every? seq colls))
;; => #'athens.sandbox.seqs/all-collections-not-empty?


(test #'all-collections-not-empty?)
;; => :ok


;; vals

(vals {:a 1 :b 2})
;; => (1 2)

;; Takes a map as an argument and returns a lazy sequence of the map's values
;; Comes out in the same order as if you called `(seq map)`

;; Returns `nil` if the map provided is empty or `nil` is provided as an argument


;; Exercises

(def vals-map {:a 1
               :b 2
               :c 3
               :d 4
               :e 5})

(defn map-product
  {:test #(do
            (assert (= 120 (map-product vals-map))))}
  [m]
  (apply * (vals m)))

(test #'map-product)
;; => :ok

