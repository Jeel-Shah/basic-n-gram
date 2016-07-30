(ns sorensen-dice-distance)

(require '[clojure.set :as set])
;; The similarity, s, is found by the following formula
;; s = 2(AB) / (A + B)

(def night-string "night")
(def nacht-string "nacht")

(defn sanitize [data]
  (set (partition 2 1 data)))

(defn sorensen-distance [set-x set-y]
  (/ (* 2 (count (set/intersection set-x set-y)))
     (+ (count set-x) (count set-y)))
  )


(prn (sorensen-distance (sanitize "1001011") (sanitize "1001011")))
(prn (sorensen-distance (sanitize "1001011") (sanitize "1001011")))
(prn (- 1 10))
