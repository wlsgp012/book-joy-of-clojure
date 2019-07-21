(ns book-joy-of-clojure.ch5.vector
  (:require [book-joy-of-clojure.core :as jin]))

(println (class (range 10)))
(println (vec (range 10)))
(println (let [my-vector [:a :b :c]]
           (into my-vector (range 10))))

(jin/titleBorder "vector-of")

(println (into (vector-of :int) [Math/PI 2 1.3]))
(println (into (vector-of :char) [100 101 102]))
;(println (into (vector-of :int) [1 2 6232938298992839892392]))

(def a-to-j (vec (map char (range 65 75))))
(println a-to-j)
(println (nth a-to-j 4))
(println (get a-to-j 4))
(println (a-to-j 4))
(println (seq a-to-j))
(println (rseq a-to-j))
(println (assoc a-to-j 4 "no longer E"))
(println (replace {2 :a, 4 :b} [1 2 3 2 3 4]))

(jin/border)
(def matrix [[1 2 3]
             [4 5 6]
             [7 8 9]])
(println (get-in matrix [1 2]))
(println (assoc-in matrix [1 2] 'x))
(println (update-in matrix [1 2] * 100))

(jin/border)
(defn neighbors
  ([size yx] (neighbors [[-1 0] [1 0] [0 -1] [0 1]] size yx))
  ([deltas size yx]
   (filter (fn [new-yx] (every? #(< -1 % size) new-yx))
           (map #(vec (map + yx %))
                deltas))))
(println (neighbors 3 [0 0]))

(println (< -1 0 3))

(jin/titleBorder "vector as stack")
(def my-stack [1 2 3])
(println (peek my-stack))
(println (pop my-stack))
(println (conj my-stack 4))
(println (+ (peek my-stack) (peek (pop my-stack))))

(jin/border)
(defn strict-map1 [f coll]
  (loop [coll coll, acc nil]
    (if (empty? coll)
      (reverse acc)
      (recur (next coll) (cons (f (first coll)) acc)))))
(println (strict-map1 - (range 5)))

(defn strict-map2 [f coll]
  (loop [coll coll, acc []]
    (if (empty? coll)
      acc
      (recur (next coll) (conj acc (f (first coll)))))))
(println (strict-map2 - (range 5)))

(jin/titleBorder "sub vector")
(println (subvec a-to-j 3 6))
(println (subvec (subvec a-to-j 3 6) 1 2))

(jin/titleBorder "vector as map entry")
(def m {:width 10 :height 20 :depth 15})
(println (first m))
(println (vector? (first m)))
(doseq [[dimension amount] m]
  (println (str (name dimension) ":" amount "inches")))

(println (some #{:b} [:a 1 :b 2]))
(println (some #{1 :b} [:a 1 :b 2]))
