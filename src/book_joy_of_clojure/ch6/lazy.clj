(ns book-joy-of-clojure.ch6.lazy)

(defn if-chain [x y z]
  (if x
    (if y
      (if z
        (do
          (println "Made it!")
          :all-truthy)))))

(println (if-chain () 42 true))
(println (if-chain true true false))

(defn and-chain [x y z]
  (and x y z (do (println "Made it!") :all-truthy)))

(println (and-chain () 42 true))
(println (and-chain true true false))