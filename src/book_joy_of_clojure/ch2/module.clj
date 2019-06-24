(ns book-joy-of-clojure.ch2.module
  (:require [clojure.set :as s])
  (:require [clojure.string :refer (capitalize)]))

(defn report-ns []
  (str "The current namespace is " *ns*))
(println (report-ns))

(println (s/intersection #{1 2 3} #{3 4 5}))

(println (map capitalize ["kilgore" "trout"]))