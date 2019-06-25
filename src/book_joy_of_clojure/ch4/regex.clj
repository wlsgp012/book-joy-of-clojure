(ns book-joy-of-clojure.ch4.regex)

(println (class #"example"))

(println (java.util.regex.Pattern/compile "\\d"))

(println (re-seq #"\w+" "one-two/three"))
(println (re-seq #"\w*(\w)" "one-two/three"))