(ns albertlatacz.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [ring.util.response :as resp]
            [albertlatacz.pages :as page]))

(defroutes app-routes
  (GET "/" [] (resp/redirect "/java-repl"))
  (GET "/java-actors-1" [] (page/java-actors-1))
  (GET "/java-actors-2" [] (page/java-actors-2))
  (GET "/java-repl" [] (page/java-repl))
  (GET "/games" [] (page/games))
  (route/resources "/")
  (route/not-found (page/not-found)))

(def app
  (handler/site app-routes))
