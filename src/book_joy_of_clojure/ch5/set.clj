(ns book-joy-of-clojure.ch5.set
  (:require [clojure.set :refer :all])
  (:require [book-joy-of-clojure.core :as jin]))

(println (#{:a :b :c :d} :c))
(println (#{:a :b :c :d} :e))

(println (get #{:a 1 :b 2} :b))
(println (get #{:a 1 :b 2} :z :nothing-doing))

(println (into #{[]} [()]))
(println (into #{[1 2]} '[(1 2)]))
(println (into #{[] #{} {}} [()]))

(println (sorted-set :b :c :a))
(println (sorted-set [3 4] [2 1] [1 2]))
;(println (sorted-set :b 1 :c 2 :a))

(println (contains? #{1 2 3 4} 4))
(println (contains? [1 2 3 4] 4))

(jin/titleBorder "intersection")
(def set-a #{:humans :fruit-bats :zombies})
(def set-b #{:chupacabra :zombies :humans})
(println (intersection set-a set-b))
(println (intersection #{1 2 3} #{1 2 4} #{4 7 2}))

(jin/titleBorder "union")
(println (union set-a set-b))
(println (union #{1 2 3} #{1 2 4} #{4 7 2}))

(jin/titleBorder "difference")
(println (difference #{1 2 3 4} #{3 4 5 6}))