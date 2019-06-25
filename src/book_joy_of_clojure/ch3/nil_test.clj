(ns book-joy-of-clojure.ch3.nil-test)

(println (seq [1 2 3]))
(println (seq []))

(defn print-seq [s]
  (when (seq s)
    (prn (first s))
    (recur (rest s))))

(print-seq [1])
