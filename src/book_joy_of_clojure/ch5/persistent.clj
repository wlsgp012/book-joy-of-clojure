(ns book-joy-of-clojure.ch5.persistent
  (:require [book-joy-of-clojure.core :as jin]))

(def ds (into-array [:willie :barnabas :adam]))
(println (seq ds))
(aset ds 1 :quentin)
(println (seq ds))

(jin/border)

(def ds1 [:willie :barnabas :adam])
(println ds1)
(def ds2 (replace {:barnabas :quentin} ds1))
(println ds1)
(println ds2)

(jin/border)
(println (= [1 2 3] '(1 2 3)))
(println (= [1 2 3] #{1 2 3}))

(jin/border)
(println (class (hash-map :a 1)))
(println (seq (hash-map :a 1)))
(println (class (seq (hash-map :a 1))))
