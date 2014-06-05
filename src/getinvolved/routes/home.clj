(ns getinvolved.routes.home
  (:use compojure.core)
  (:require [getinvolved.layout :as layout]
            [getinvolved.util :as util]))

(defn home-page []
  (layout/render [:p "something"]))

(defroutes home-routes
  (GET "/" [] (home-page)))
