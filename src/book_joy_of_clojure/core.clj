(ns book-joy-of-clojure.core)

(defn border []
  (println)
  (println "-----------------------------------------")
  (println))

(defn titleBorder [title]
  (println)
  (println (str "----------------------- " title " ------------------")))