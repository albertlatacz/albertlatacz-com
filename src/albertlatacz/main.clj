(ns albertlatacz.main
  (:use [ring.adapter.jetty :only [run-jetty]])

  (:require [albertlatacz.handler :as web]))

(defn -main [& m]
  (let [port (Integer. (get (System/getenv) "PORT" "8085"))]
    (run-jetty #'web/app {:port port})))
