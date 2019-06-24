(ns book-joy-of-clojure.ch2.quote-syntax-quote
  (:require [book-joy-of-clojure.core :as jin]))

(jin/titleBorder "quote")
(println (cons 1 [2 3]))
(println (quote (cons 1 [2 3])))
(println (cons 1 '(2 3)))

(jin/titleBorder "syntax quote")
(println `(1 2 3))
(println `map)
(println `Integer)
(println `(map even? [1 2 3]))

(jin/titleBorder "unquote")
(println `(+ 10 (* 3 2)))
(println `(+ 10 ~(* 3 2)))

(jin/titleBorder "unquote")
(println (let [x '(2 3)] `(1 ~@x)))
