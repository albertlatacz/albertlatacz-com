(defproject albertlatacz-com "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :aot  'albertlatacz.main
  :main albertlatacz.main
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [ring "1.1.6"]
                 [compojure "1.1.5"]
                 [stencil "0.3.2"]
                 [cheshire "5.1.1"]]
  :plugins [[lein-ring "0.8.2"]]
  :ring {:handler albertlatacz.handler/app}
  :profiles {:dev {:dependencies [[ring-mock "0.1.3"]]}})
