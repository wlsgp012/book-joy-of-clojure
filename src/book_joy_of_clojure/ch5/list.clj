(ns book-joy-of-clojure.ch5.list)

(println (cons 1 '(2 3)))
(println (conj '(2 3) 1))
(println (counted? (range 10)))