(ns main
  (:require ["ink-spinner" :default is]
            ["term-size" :default term-size]))

(defn run []
  (prn (term-size))
  (.log js/console is))
