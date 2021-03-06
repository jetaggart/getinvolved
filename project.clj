(defproject
  getinvolved
  "0.1.0-SNAPSHOT"
  :repl-options
  {:init-ns getinvolved.repl}
  :dependencies
  [[ring-server "0.3.1"]
   [domina "1.0.2"]
   [postgresql/postgresql "9.1-901-1.jdbc4"]
   [ragtime "0.3.6"]
   [environ "0.5.0"]
   [com.taoensso/timbre "3.2.1"]
   [prismatic/dommy "0.1.2"]
   [org.clojure/clojurescript "0.0-2202"]
   [org.clojure/clojure "1.6.0"]
   [com.taoensso/tower "2.0.2"]
   [log4j "1.2.17" :exclusions [javax.mail/mail
                                javax.jms/jms
                                com.sun.jdmk/jmxtools
                                com.sun.jmx/jmxri]]
   [korma "0.3.1"]
   [cljs-ajax "0.2.4"]
   [hiccup "1.0.5"]
   [kerodon "0.3.0"]
   [lib-noir "0.8.3"]]

  :cljsbuild {:builds
               [{:source-paths ["src-cljs"],
                 :compiler     {:pretty-print  false,
                                :output-to     "resources/public/js/site.js",
                                :optimizations :advanced}}]}
  :ring {:handler getinvolved.handler/app,
         :init    getinvolved.handler/init,
         :destroy getinvolved.handler/destroy}
  :ragtime {:migrations ragtime.sql.files/migrations,
            :database   "jdbc:postgresql://localhost/getinvolved?user=db_user_name_here&password=db_user_password_here"}
  :profiles {:uberjar    {:aot :all},
             :production {:ring
                           {:open-browser? false, :stacktraces? false, :auto-reload? false}},
             :dev        {:dependencies
                               [[org.clojure/core.cache "0.6.3"]
                                [ring/ring-devel "1.2.2"]
                                [ring-mock "0.1.5"]],
                          :env {:dev true}}}
  :url "http://example.com/FIXME"
  :plugins [[lein-ring "0.8.10"]
            [lein-environ "0.5.0"]
            [ragtime/ragtime.lein "0.3.6"]
            [lein-cljsbuild "0.3.3"]]
  :description "FIXME: write description"
  :min-lein-version "2.0.0")