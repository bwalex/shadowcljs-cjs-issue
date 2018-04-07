(ns t.core
  (:require ["/gen/abc" :as abc]))

(defn on-js-reload []
  (abc/say #js {"a" 1, "b" 2, "c" 3}))

(defn ^:export init []
  (abc/say #js {"a" 1, "b" 2, "c" 3}))
