(ns book-joy-of-clojure.ch2.to-call-function
  (:require [book-joy-of-clojure.core :as jin]))

(jin/titleBorder "def")
(def x 42)
(println x)
(def y)
(println y)

(jin/titleBorder "function")
(def anony ((fn [x y]
              (println "Making a set")
              #{x y}) 1 2))
(println anony)

(def make-set
  (fn [x y]
    (println "Making a set")
    #{x y}))
(println (make-set 1 2))

(defn make-set2
  "Takes two values and makes a set from them."
  [x y]
  (println "Making a set")
  #{x y})
(println (make-set2 1 2))

(defn make-set-overloading
  ([x] #{x})
  ([x y] #{x y}))
(println (make-set-overloading 42))

(defn arity2+ [first second & more]
  (vector first second more))
(println (arity2+ 1 2))
(println (arity2+ 1 2 3 4))

(def make-list0 #(list))
(println (make-list0))
(def make-list2 #(list %1 %2))
(println (make-list2 1 2))
(def make-list2+ #(list %1 %2 %&))
(println (make-list2+ 1 2 3 4 5))