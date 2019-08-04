(ns book-joy-of-clojure.ch6.steps
  (:use book-joy-of-clojure.core))


(defn rec-step [[x & xs]]
  (if x
    [x (rec-step xs)]
    []))

(println (rec-step [1 2 3 4]))
;(println (rec-step (range 200000)))

(defn lz-rec-step [s]
  (lazy-seq
    (if (seq s)
      [(first s) (lz-rec-step (rest s))]
      [])))

(println (lz-rec-step [1 2 3 4]))
(println (class (lz-rec-step [1 2 3 4])))
(println (dorun (lz-rec-step (range 200000))))

(defn simple-range [i limit]
  (lazy-seq
    (when (< i limit)
      (cons i (simple-range (inc i) limit)))))
(println (simple-range 0 9))

(border)
(println (let [a '(1 2 3)] (first a) (last a)))
(println (let [a '(1 2 3)] (last a) (first a)))
(println (class (range 10)))

(comment (println (let [r (range 1e9)]
                    (first r)
                    (last r))))
(comment (println (let [r (range 1e9)]
                    (last r)
                    (first r))))

;(println (iterate (fn [n] (/ n 2)) 1))

