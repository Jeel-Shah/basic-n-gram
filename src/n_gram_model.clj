(ns n-gram-model)

(require '[clojure.string :as str])

;; Let's grab the user input
(def user-input (read-line))

(println user-input)

;; Split and count the occurences of each word and figure out the total as well
(defn count-and-split [lines]
  (frequencies (str/split lines #" ")))


(println (count-and-split "Wait isn't this just great I mean what do you think?"))
