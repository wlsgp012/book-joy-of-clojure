(ns book-joy-of-clojure.ch4.keyword
  (:require [book-joy-of-clojure.core :as jin]))

(def population {:zombies 2700 :humans 9})
(println (get population :zombies))
(println (/ (get population :zombies)
            (get population :humans))
         "zombies per capita")
(println (:zombies population))

(jin/border)

(defn pour [lb ub]
  (cond
    (= ub :toujours) (iterate inc lb)
    :else (range lb ub)))

(println (pour 1 10))
;(println (pour 1 :toujours))

