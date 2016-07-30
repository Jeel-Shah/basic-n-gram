(ns n-gram-model)

(require '[clojure.string :as str])

(def test-string "Wait isn't this just great I mean what do you think?")

;; Split and count the occurences of each word and figure out the total as well

(defn string-split [my-string]
  (str/split my-string #" "))

(defn sum [list-of-values]
  (apply + list-of-values))

(defn select-values [map keys]
  (vals (select-keys map keys)))

(defn take-two [my-string]
  (take-last 2 my-string))

(defn string-tuple [my-string]
  (partition 2 1 my-string))

(defn split-and-frequent-tuple [lines]
  (frequencies (string-tuple lines)))

(defn split-and-frequent [lines]
  (frequencies lines))

(defn seq-zero [binary-seq]
  (apply max
         (map count
              (set (str/split binary-seq #"1"))))
  )

(def string-pairs (split-and-frequent-tuple (string-split "<s> I am Sam </s> <s> Sam I am </s> <s> I do not like green eggs and ham </s>")))
(def word-freq (split-and-frequent (string-split "<s> I am Sam </s> <s> Sam I am </s> <s> I do not like green eggs and ham </s>")))

;; Calculate that bigram probability
;(prn (/ (string-pairs ["<s>" "I"])
;        (word-freq "<s>")))

(prn (seq-zero "1000010001"))
(prn (seq-zero "1000010001001"))
