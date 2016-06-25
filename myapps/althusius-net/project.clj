(defproject althusius-net "0.1.0-SNAPSHOT"
  :description "Althusius.net Website"
  :url "http://althusius.net"
  :license {:name "Apache 2.0"
            :url "https://opensource.org/licenses/Apache-2.0"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [stasis "1.0.0"]
                 [ring "1.2.1"]
                 [hiccup "1.0.5"]
                 [me.raynes/cegdown "0.1.1"]
                 [enlive "1.1.5"]
                 [clygments "0.1.1"]
                 [optimus "0.14.2"]]
  :ring {:handler althusius-net.web/app}
  :aliases {"build-site" ["run" "-m" "althusius-net.web/export"]}
  :profiles {:dev {:plugins [[lein-ring "0.8.10"]]}
             :test {:dependencies [[midje "1.6.0"]]
                    :plugins [[lein-midje "3.1.3"]]}})
