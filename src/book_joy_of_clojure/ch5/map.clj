(ns book-joy-of-clojure.ch5.map
  (:require [book-joy-of-clojure.core :refer :all]))

(println (hash-map :a 1 :b 2 :c 3 :d 4 :e 5))

(let [m {:a 1 1 :b [1 2 3] "4 5 6"}]
  (println [(get m :a) (get m [1 2 3])]))

(println (seq {:a 1 :b 2}))

(println (into {} [[:a 1] [:b 2]]))
(println (into {} (map vec '[(:a 1) (:b 2)])))
(println (apply hash-map [:a 1 :b 2]))
(println (zipmap [:a :b] [1 2]))

(titleBorder "sort map")

(println (sorted-map :thx 1138 :r2d 2))
;(println (sorted-map :thx 1138 "2" 2))

(println (sorted-map "bac" 2 "abc" 9))
(println (sorted-map-by #(compare (subs %1 1) (subs %2 1)) "bac" 2 "abc" 9))

(println (assoc {1 :int} 1.0 :float))
(println (assoc (sorted-map 1 :int) 1.0 :float))

(titleBorder "array map")

(println (seq (hash-map :a 1 :b 2 :c 3)))
(println (seq (array-map :a 1 :b 2 :c 3)))