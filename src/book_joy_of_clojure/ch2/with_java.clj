(ns book-joy-of-clojure.ch2.with-java
  (:require [book-joy-of-clojure.core :as jin]))

(println (Math/sqrt 9))
(println (new java.util.HashMap {"foo" 42 "bar" 9 "baz" "quux"}))
(println (java.util.HashMap. {"foo" 42 "bar" 9 "baz" "quux"}))
(println (.-x (java.awt.Point. 10 20)))
(println (.divide (java.math.BigDecimal. "42") 2M))
(println (let [origin (java.awt.Point. 0 0)]
          (set! (.-x origin) 15)
          (str origin)))

(jin/titleBorder ".. macro")
; in java new java.util.Date().toString().endsWith("2013")
(println (.endsWith (.toString (java.util.Date.)) "2014"))
(println (.. (java.util.Date.) toString (endsWith "2014")))

(println (doto (java.util.HashMap.)
           (.put "HOME" "/home/me")
           (.put "SRC" "src")))
