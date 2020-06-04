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


;; keys

(keys {:a 1 :b 2})
;; => (:a :b)

;; Takes a map as an argument and returns a lazy sequence of the map's keys
;; Comes out in the same order as if you called `(seq map)`

;; Returns `nil` if the map provided is empty or `nil` is provided as an argument

;; Exercises

(def keys-map {"Learning" 1
               "Clojure"  2
               "is"       3
               "so"       4
               "much"     5
               "fun"      6})

(defn key-sentence
  {:test #(do
            (assert (= "Learning Clojure is so much fun!!!" (key-sentence keys-map))))}
  [m]
  (str (clojure.string/join " " (keys keys-map)) "!!!"))


(test #'key-sentence)
;; => :ok

;; lazy-seq

;; (lazy-seq & body)

;; Takes a body of expressions that returns an `ISeq` or `nil`, and yields
;; a Seqable object that will invoke the body only the first time `seq`
;; is called, and will cache the result and return it on all subsequent
;; `seq` calls.


;; lazy-seq for reusing the result of expressions that create lazy sequences


(def ls123 (lazy-seq [1 2 3]))
;; => #'athens.sandbox.seqs/ls123

ls123
;; => (1 2 3)


(time ls123)
;; => "Elapsed time: 0.024633 msecs"

(time (lazy-seq [1 2 3]))
;; => "Elapsed time: 0.155445 msecs"

;; Lazy sequences are especially useful for sequences that can go on for very long / infinitely

(defn fib
  ([]
   (fib 1 1))
  ([a b]
   ;; Creates a lazy sequence of Fibonacci numbers
   (lazy-seq (cons a (fib b (+ a b))))))

(take 10 (fib))
;; Returns the first 10 numbers of the Fibonacci sequence, try it out!



;; Exercises


(defn odd-numbers
  {:test #(do
            (assert (= (take 5  (odd-numbers))   '(1 3 5 7 9)))
            (assert (= (take 10 (odd-numbers))   '(1 3 5 7 9 11 13 15 17 19)))
            (assert (= (take 5  (odd-numbers 2)) '(3 5 7 9 11))))}
  ([]
   (odd-numbers 1))
  ([a]
   (if (= (mod a 2) 0)
     (odd-numbers (inc a))
     (lazy-seq (cons a (odd-numbers (+ a 2)))))))

(test #'odd-numbers)
;; => :ok




