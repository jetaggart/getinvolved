(ns getinvolved.layout
  (:require [hiccup.core :refer [html]]))

(defn render [& content]
  (html
    [:head [:link {:href "css/main.css" :rel "stylesheet" :type "text/css"}]]
    [:main content]))

