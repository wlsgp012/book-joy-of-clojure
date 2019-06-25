(ns book-joy-of-clojure.ch4.precision
  (:require [book-joy-of-clojure.core :as jin]))

(let [imadeuapi 3.11131232423432432423894723849032409234809822384093824098M]
  (println (class imadeuapi))
  (println imadeuapi)
  imadeuapi)

(let [butieatedit 3.11131232423432432423894723849032409234809822384093824098]
  (println (class butieatedit))
  (println butieatedit)
  butieatedit)

(jin/border)
(def clueless 9)
(println (class clueless))
(println (class (+ clueless 900000000000000)))
(println (class (+ clueless 9000000000000000000000000)))
(println (class (+ clueless 9.0)))

(jin/border)
;(println (+ Long/MAX_VALUE Long/MAX_VALUE))
(println (unchecked-add Long/MAX_VALUE Long/MAX_VALUE))

(println (float 0.000000000000000000000000000000000000000000000000001))
(println (+ 0.1M 0.1M 0.1 0.1M 0.1M 0.1M 0.1M 0.1M 0.1M 0.1M))