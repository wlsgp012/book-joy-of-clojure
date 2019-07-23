(ns book-joy-of-clojure.ch6.data-sharing
  (:use book-joy-of-clojure.core))

(def baselist (list :barnabas :adam))
(def lst1 (cons :willie baselist))
(def lst2 (cons :phoenix baselist))

(println lst1)
(println lst2)

(println (= (next lst1) (next lst2)))
(println (identical? (next lst1) (next lst2)))

(titleBorder "tree")

(defn xconj [t v]
  (cond
    (nil? t) {:val v, :L nil, :R nil}
    (< v (:val t)) {:val (:val t) :L (xconj (:L t) v) :R (:R t)}
    :else {:val (:val t) :L (:L t) :R (xconj (:R t) v)}))

;(println (xconj nil 5))

(def tree1 (xconj nil 5))
(println tree1)

(def tree1 (xconj tree1 3))
(println tree1)

(def tree1 (xconj tree1 2))
(println tree1)

(defn xseq [t]
  (when t
    (concat (xseq (:L t)) [(:val t)] (xseq (:R t)))))

(println (xseq tree1))

(def tree2 (xconj tree1 7))
(println tree2)
(println (xseq tree2))
