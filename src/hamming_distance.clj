(ns hamming-distance)

(require '[clojure.string :as string])


(def sample-string "karolin")
(def sample-string-2 "kathrin")

(defn non-zero [x]
  (not= x 0))

(defn hamming-distance [stg stg1]
  (if (not= (count stg) (count stg1))
    (prn "The length of the strings is not the same.")
    (prn "The hamming distance is: "
         (get (frequencies
           (map non-zero
                (map compare stg stg1)))
         true)))
    )

(defn gen-padding [ct]
  (apply str (repeat ct "~"))
  )

(defn string-append [stg ct]
  (str stg (gen-padding ct))
  )

(prn (hamming-distance sample-string sample-string-2))
(prn (hamming-distance "1011101" "1001001"))
(prn (hamming-distance "2173896" "2233796"))
(prn (hamming-distance "2173896" "22337967"))
(prn (hamming-distance "jeel" "neel"))
(prn (string-append "Jeel" 5))
