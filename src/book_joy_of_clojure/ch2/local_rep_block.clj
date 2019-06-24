(ns book-joy-of-clojure.ch2.local-rep-block
  (:require [book-joy-of-clojure.core :as jin]))

(jin/titleBorder "block")
(println
  (do
    (def x 5)
    (def y 4)
    (+ x y)
    [x y]))

(jin/titleBorder "local")
(println
  (let [r 5 pi 3.1415 r-squared (* r r)]
    (println "radius is" r)
    (* pi r-squared)))

(jin/titleBorder "recur")
(defn print-down-from [x]
  (when (pos? x)
    (println x)
    (recur (dec x))))
(print-down-from 5)

(defn sum-down-from [sum x]
  (if (pos? x)
    (recur (+ sum x) (dec x))
    sum))
(println (sum-down-from 0 10))

(defn sum-down-from2 [initial-x]
  (loop [sum 0,x initial-x]
    (if (pos? x)
      (recur (+ sum x) (dec x))
      sum)))
(println (sum-down-from2 10))