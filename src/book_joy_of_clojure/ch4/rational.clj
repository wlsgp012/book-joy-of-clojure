(ns book-joy-of-clojure.ch4.rational)

(def a 1.0e50)
(def b -1.0e50)
(def c 17.0e00)
(println (+ (+ a b) c))
(println (+ a (+ b c)))

(def a2 (rationalize 1.0e50))
(def b2 (rationalize -1.0e50))
(def c2 (rationalize 17.0e00))
(println (+ (+ a2 b2) c2))
(println (+ a2 (+ b2 c2)))

(println (numerator (/ 123 10)))
(println (denominator (/ 123 10)))