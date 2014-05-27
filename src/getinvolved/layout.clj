(ns getinvolved.layout
  (:require [hiccup.core :refer [html]]))

(defn render []
  (html [:span {:class "foo"} "Welcome to getinvolved"]))

