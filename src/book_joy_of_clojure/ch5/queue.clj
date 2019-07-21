(ns book-joy-of-clojure.ch5.queue)

(defmethod print-method clojure.lang.PersistentQueue
           [q w]
           (print-method '<- w)
           (print-method (seq q) w)
           (print-method '-< w))

(println clojure.lang.PersistentQueue/EMPTY)

(def schedule
  (conj clojure.lang.PersistentQueue/EMPTY :wake-up :shower :brush-teeth))

(println schedule)
(println (peek schedule))
(println schedule)
(println (pop schedule))
(println (rest schedule))
(println schedule)
