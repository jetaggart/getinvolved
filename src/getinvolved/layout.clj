(ns getinvolved.layout
  (:require [hiccup.core :refer [html]]))

(defn render [& content]
  (html
    [:head [:link {:href "css/main.css" :rel "stylesheet" :type "text/css"}]]
    [:body
     [:nav
      [:div.menu-wrapper
       [:a.logo {:href "javascript:void(0);"}
        [:img {:alt "" :src "https://raw.github.com/Magnus-G/Random/master/placeholder_logo_1.png"}]]
       [:p#js-mobile-menu.navigation-menu-button "MENU"]
       [:div.nav
        [:ul#navigation-menu
         [:li.nav-link
          [:a {:href "javascript:void(0);"} "Stories"]]
         [:li.nav-link
          [:a {:href "javascript:void(0);"} "Contributors"]]]]
       [:div.navigation-tools
        [:a.sign-up {:href "javascript:void(0);"} "Get Involved"]]]]
     [:main content]]))

