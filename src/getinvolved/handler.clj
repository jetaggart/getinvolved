(ns getinvolved.handler
  (:require [compojure.core :refer [defroutes]]
            [getinvolved.routes.home :refer [home-routes]]
            [getinvolved.middleware :as middleware]
            [noir.util.middleware :refer [app-handler]]
            [compojure.route :as route]
            [taoensso.timbre :as timbre]
            [taoensso.timbre.appenders.rotor :as rotor]
            [environ.core :refer [env]]
            ;[getinvolved.routes.auth :refer [auth-routes]]
            [getinvolved.db.schema :as schema]
            ;[getinvolved.routes.cljsexample :refer [cljs-routes]]
            ))

(defroutes app-routes
           (route/resources "/")
           (route/not-found "Not Found"))

(defn init []
  (timbre/set-config! [:appenders :rotor]
                      {:min-level             :info,
                       :enabled?              true,
                       :async?                false,
                       :max-message-per-msecs nil,
                       :fn                    rotor/appender-fn})
  (timbre/set-config! [:shared-appender-config :rotor]
                      {:path "getinvolved.log", :max-size (* 512 1024), :backlog 10})
  (timbre/info "getinvolved started successfully"))

(defn destroy []
  (timbre/info "getinvolved is shutting down..."))

(def app
  (app-handler [home-routes app-routes]
               :middleware [middleware/template-error-page middleware/log-request]
               :access-rules []
               :formats [:json-kw :edn]))

