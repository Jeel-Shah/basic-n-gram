(ns miller-rabin)
(use 'clojure.math.numeric-tower)

;; This is taken directly from the jeremykun website. All credits go to him.
;; This is only an implemention in Clojure

(defn compose [exponent-of-two n]
  (if (not= 0 (mod n 2))
    {:exponent exponent-of-two :n n}
    (compose (/ n 2) (+ 1 exponent-of-two)))
  )
;; pow(x, y, z) is x^y mod z

(defn isWitness [possibleWitness p exponent remainder])

;(prn (compose 0 10))
(prn (expt 2 3))
