(ns book-joy-of-clojure.ch2.collections
  (:require [book-joy-of-clojure.core :as jin]))

(jin/titleBorder "list")
(println '(1 2 3 4))
(println (list 1 2 3 4))
(println (= nil '()))

(jin/titleBorder "vector")
(println [1 2 :a :b])
(println (= nil []))

(jin/titleBorder "map")
(println {1 "one" 2 "two"})
(println (= nil {}))

(jin/titleBorder "set")
(println #{1 2 "three"})
(println (= nil #{}))
