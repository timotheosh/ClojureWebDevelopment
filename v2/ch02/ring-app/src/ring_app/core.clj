(ns ring-app.core
  (:require [ring.adapter.jetty :as jetty]
            [ring.util.response :as response]
            [ring.middleware.reload :refer [wrap-reload]]))

(defn handler [request-map]
  (response/response
   (str "<html><body><p>your IP is: "
        (:remote-addr request-map) "</p>"
        "<p>your client is: "
        (get-in request-map [:headers "user-agent"]) "</p>"
        "<p>Hello world</p>"
        "</body></html>")))

(defn wrap-nocache [handler]
  (fn [request]
    (-> request
        handler
        (assoc-in [:headers "Pragma"] "no-cache"))))

(defn -main []
  (jetty/run-jetty
   (-> #'handler wrap-nocache wrap-reload)
   {:port 3000
    :join? false}))
