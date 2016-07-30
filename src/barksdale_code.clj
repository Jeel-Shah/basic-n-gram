(ns barksdale-code)

;; The barksdale code works as follows
;;    Given a number ... replace each number with its counterpart i.e.
;;      1 <-> 9
;;      3 <-> 7
;;      4 <-> 6
;;      2 <-> 8
;;      0 <-> 5

(defn to-int [x]
  (Character/getNumericValue x))

(defn converted-number [x]
  (map to-int (seq x)))

(defn switch [x]
  (cond
    (= x 5) 0
    (= x 0) 5
    :else (- 10 x))
  )

(defn get-barksdale-code [number]
  (apply str
         (map switch
              (converted-number number)))
  )

(prn (get-barksdale-code "416-439-6126"))
(prn (get-barksdale-code "51965810"))
