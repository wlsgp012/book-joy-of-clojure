(ns book-joy-of-clojure.ch4.symbol)

(println (identical? 'goat 'goat))
(println (= 'goat 'goat))
(println (name 'goat))

(println (let [x (with-meta 'goat {:ornery true})
               y (with-meta 'goat {:ornery false})]
           [(= x y)
            (identical? x y)
            (meta x)
            (meta y)]))

(defn best [f xs]
  (reduce #(if (f % %2) % %2) xs))

(println (best > [1 3 4 2 7 5 3]))