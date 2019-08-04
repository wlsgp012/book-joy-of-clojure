(ns book-joy-of-clojure.ch6.tri-nums)

(defn triangle [n]
  (/ (* n (+ n 1)) 2))

(println (triangle 100))
(def tri-nums (map triangle (iterate inc 1)))

(println (take 10 tri-nums))
(println (take 10 (filter even? tri-nums)))
(println (double (reduce + (take 1000 (map / tri-nums)))))
(println (take 2 (drop-while #(< % 100000) tri-nums)))

(defn inf-triangles [n]
  {:head (triangle n)
   :tail (delay (inf-triangles (inc n)))})
(defn head [l] (:head l))
(defn tail [l] (force (:tail l)))
(def tri-nums2 (inf-triangles 1))
(println (head tri-nums2))
(println (head (tail tri-nums2)))
(println (head (tail (tail tri-nums2))))

(defn taker [n l]
  (loop [t n, src l, ret []]
    (if (zero? t)
      ret
      (recur (dec t) (tail src) (conj ret (head src))))))
(println (taker 10 tri-nums2))

(defn nthr [l n]
  (if (zero? n)
    (head l)
    (recur (tail l) (dec n))))
(println (nthr tri-nums2 99))
(println (triangle 10000000))
(println (nthr tri-nums2 9999999))

(defn defer-expensive [cheap expensive]
  (if-let [good-enough (force cheap)]
    good-enough
    (force expensive)))

;(println (defer-expensive (delay :cheap) (delay (do (Thread/sleep 3000) :expensive))))
;(println (defer-expensive (delay false) (delay (do (Thread/sleep 3000) :expensive))))
;(println (defer-expensive false (delay (do (Thread/sleep 3000) :expensive))))