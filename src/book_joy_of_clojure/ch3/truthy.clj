(ns book-joy-of-clojure.ch3.truthy
  (:require [book-joy-of-clojure.core :as jin]))

(println (if true :truthy :falsy))
(println (if 0 :truthy :falsy))
(println (if [] :truthy :falsy))
(println (if '() :truthy :falsy))
(println (if nil :truthy :falsy))
(println (if false :truthy :falsy))

(jin/border)

(def evil-false (Boolean. "false")) ; never do like this
(println evil-false)
(println (= false evil-false))
(println (if evil-false :truthy :falsy))
(println (if (Boolean/valueOf "false") :truthy :falsy))

(jin/border)

(println (when (nil? nil) "Actually nil, not false"))