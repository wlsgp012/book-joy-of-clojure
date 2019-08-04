(ns book-joy-of-clojure.ch6.rest-vs-next
  (:require [book-joy-of-clojure.core :refer :all]))
(def very-lazy (-> (iterate #(do (print \.) (inc %)) 1) rest rest rest))
(border)
(def less-lazy (-> (iterate #(do (print \.) (inc %)) 1) next next next))
(border)
(println (first very-lazy))
(println (first less-lazy))
