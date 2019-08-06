(ns book-joy-of-clojure.ch6.quick-sort)

(defn rand-ints [n]
  (take n (repeatedly #(rand-int n))))

(defn sort-parts [work]
  (lazy-seq
    (loop [[part & parts] work]
      ;(println work)
      (if-let [[pivot & xs] (seq part)]
        (let [smaller? #(< % pivot)]
          (recur (list*
                   (filter smaller? xs)
                   pivot
                   (remove smaller? xs)
                   parts)))
        (when-let [[x & parts] parts]
          (cons x (sort-parts parts)))))))

(defn qsort [xs]
  (sort-parts (list xs)))

(println (str "result : " (list* (qsort [2 1 4 3]))))

(println (take 10 (qsort (rand-ints 100000))))