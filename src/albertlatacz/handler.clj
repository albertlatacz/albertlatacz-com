(ns albertlatacz.handler
  (:use compojure.core
        stencil.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))


(defn render-page [model]
  (render-file "_layout" model))


(defroutes app-routes
  (GET "/" [] (render-page {:page-content (render-file "java_actors_1" {})}))
  (GET "/java-actors-1" [] (render-page {:page-content (render-file "java_actors_1" {})}))
  (route/resources "/")
  (route/not-found "Not Found"))






(def app
  (handler/site app-routes))
