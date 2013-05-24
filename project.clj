(defproject albertlatacz-com "0.1.0-SNAPSHOT"
  :description "Personal web site"
  :url "http://www.albertlatacz.com/"
  :min-lein-version "2.0.0"
  :aot  'albertlatacz.main
  :main albertlatacz.main
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [ring "1.1.8"]
                 [compojure "1.1.5"]
                 [stencil "0.3.2"]
                 [cheshire "5.2.0"]]
  :plugins [[lein-ring "0.8.5"]]
  :ring {:handler albertlatacz.handler/app}
  :profiles {:dev {:dependencies [[ring-mock "0.1.5"]]}})
