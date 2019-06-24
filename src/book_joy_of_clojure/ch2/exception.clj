(ns book-joy-of-clojure.ch2.exception)

;(throw (Exception. "I done throwed"))

(defn throw-catch [f]
  [(try
     (f)
     (catch ArithmeticException e "No dividing by zero!")
     (catch Exception e (str "You are so bad " (.getMessage e)))
     (finally (println "returning... ")))])

(println (throw-catch #(/ 10 5)))
(println (throw-catch #(/ 10 0)))
(println (throw-catch #(throw (Exception. "Crybaby"))))