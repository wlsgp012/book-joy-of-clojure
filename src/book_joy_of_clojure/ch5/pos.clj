(ns book-joy-of-clojure.ch5.pos)

(comment
  (defn pos [e coll]
    (let [cmp (if (map? coll)
                #(= (second %1) %2)
                #(= %1 %2))]
      (loop [s coll idx 0]
        (when (seq s)
          (if (cmp (first s) e)
            (if (map? coll)
             (first (first s))
             idx)
            (recur (next s) (inc idx))))))))

(defn index [coll]
  (cond
    (map? coll) (seq coll)
    (set? coll) (map vector coll coll)
    :else (map vector (iterate inc 0) coll)))

(defn pos [e coll]
  (for [[i v] (index coll) :when (= e v)] i))

(comment (defn pos [pred coll]
           (for [[i v] (index coll) :when (pred v)] i)))


(println (pos 3 [:a 1 :b 2 :c 3 :d 4]))
(println (pos :foo [:a 1 :b 2 :c 3 :d 4]))
(println (pos 3 {:a 1 :b 2 :c 3 :d 4}))
(println (pos \3 ":a 1 :b 2 :c 3 :d 4"))