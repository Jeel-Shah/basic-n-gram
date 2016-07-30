(ns damerau-levenstein)


(prn (nth "Great" 1))

(defn indicator [x y]
  (if (= x y)
    0
    1)
  )

(loop [i 5 acc 1]
  (if (zero? i)
    (prn acc)
    (recur (dec i) (* acc i)))
  )

(loop [i (count "Great") ch '()]
  (if (zero? i)
    (prn ch)
    (recur (dec i) (conj ch (nth "Great" (dec i)))))
  )

(defn sample-string "hello")
(defn sample-string-2 "hell0")

;; Recursively defined Damerau-Levenshtein
(defn d [i,j]
  (if (= 0 (min i j))
    (max i j))

  (if (and (> 1 i) (> 1 j) ())
    0)
  )
(prn (and (> 2 1) (> 3 1)))
