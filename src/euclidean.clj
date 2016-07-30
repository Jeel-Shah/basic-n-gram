(ns euclidean)


(defn euclidean-algo [a b]
  (if  (zero? b)
    a
  (euclidean-algo b (rem a b)))
  )


;(prn (euclidean-algo 3654 1365))
(prn (euclidean-algo 3654 1365))