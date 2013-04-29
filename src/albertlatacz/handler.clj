(ns albertlatacz.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [albertlatacz.pages :as page]))

(defroutes app-routes
  (GET "/" [] (page/java-repl))
  (GET "/java-actors-1" [] (page/java-actors-1))
  (GET "/java-actors-2" [] (page/java-actors-2))
  (GET "/java-repl" [] (page/java-repl))
  (route/resources "/")
  (route/not-found (page/not-found)))

(def app
  (handler/site app-routes))
