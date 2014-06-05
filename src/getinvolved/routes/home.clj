(ns getinvolved.routes.home
  (:use compojure.core)
  (:require [getinvolved.layout :as layout]
            [getinvolved.util :as util]))

(defn home-page []
  (layout/render
    [:div.hero
     [:div.hero-inner
      [:a.hero-logo {:href "javascript:void(0)"}
       [:img {:alt "hero" :src "https://raw.github.com/Magnus-G/Random/master/placeholder_logo_1.png"}]]
      [:div.hero-copy
       [:h1 "Get Involved"]
       [:p "Want to contribute more than money? Find a story!"]]
      [:button "Learn More"]]]
    [:section
     [:div.bullets
      [:a.bullet.two-col-bullet {:href "/users/new"}
       [:div.bullet-icon.bullet-icon-1
        [:img {:src "https://raw.github.com/Magnus-G/Random/master/placeholder_logo_2.png"}]]
       [:div.bullet-content
        [:h2 "Begin a Story"]
        [:p "Lorem dolor sit amet consectetur adipisicing elit. Doloremque, minus, blanditiis, voluptatibus nulla quia ipsam sequi quos iusto aliquam iste magnam accusamus molestias quo illum impedit. Odit officia autem."]]]
      [:a.bullet.two-col-bullet
       [:div.bullet-icon.bullet-icon-2
        [:img {:src "https://raw.github.com/Magnus-G/Random/master/placeholder_logo_3.png"}]]
       [:div.bullet-content
        [:h2 "Contribute to a story"]
        [:p "Lorem ipsum dolor sit amet consectetur adipisicing elit. Doloremque, minus, blanditiis, voluptatibus nulla quia ipsam sequi quos iusto aliquam iste magnam accusamus molestias quo illum."]]]]]))

(defroutes home-routes
           (GET "/" [] (home-page)))
