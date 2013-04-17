(ns clojure-heroku-playground.main
  (:use [ring.adapter.jetty :only [run-jetty]])
  (:require [albertlatacz-com.handler :as web]))

(defn -main [& m]
  (run-jetty #'web/app {:port (Integer. (get (System/getenv) "PORT" "8085"))}))
