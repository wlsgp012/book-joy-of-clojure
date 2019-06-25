(ns book-joy-of-clojure.ch3.destructuring)


(def guys-whole-name ["Guy" "Lewis" "Steele"])

(println (let [[f-name m-name l-name] guys-whole-name]
           (str l-name ", " f-name " " m-name)))

(let [[a b c & more] (range 10)]
  (println "a b c are:" a b c)
  (println "more is:" more))

(let [range-vec (vec (range 10)) [a b c & more :as all] range-vec]
  (println "a b c are:" a b c)
  (println "more is:" more)
  (println "all is:" all))

(def guys-name-map {:f "Guy" :m-name "Lewis" :l-name "Steele"})

(println (let [{f-name :f, m-name :m-name, l-name :l-name} guys-name-map]
           (str l-name ", " f-name " " m-name)))

(println (let [{:keys [f m-name l-name]} guys-name-map]
           (str l-name ", " f " " m-name)))

(let [{fname :f, :as whole-name} guys-name-map]
  (println "First name is" fname)
  (println "Whole name is below:" whole-name))

(let [{:keys [title f m-name l-name], :or {title "Mr."} } guys-name-map]
  (println title f m-name l-name))

(defn whole-name [& args]
  (let [{:keys [f m-name l-name]} args]
    (str l-name ", " f " " m-name)))

(println (whole-name :f "Guy" :m-name "Lewis" :l-name "Steele"))

(println (let [{first-thing 0, last-thing 3} [1 2 3 4]]
           [first-thing last-thing]))
(defn print-last-name [{:keys [l-name]}]
  (println l-name))
(print-last-name guys-name-map)