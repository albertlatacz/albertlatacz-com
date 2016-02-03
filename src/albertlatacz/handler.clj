(ns albertlatacz.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [ring.util.response :as resp]
            [albertlatacz.pages :as page]))

(defroutes app-routes
  (GET "/" [] (resp/redirect "/java-repl"))
  (GET "/java-repl" [] (page/java-repl))
  (GET "/glue-pdfs" [] (page/glue-pdfs))
  (GET "/games" [] (page/games))
  (route/resources "/")
  (route/not-found (page/not-found)))

(def app
  (handler/site app-routes))
