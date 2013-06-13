(ns albertlatacz.pages
  (:require [cheshire.core :as json]
            [stencil.core :as mst]))

(defn render-page [file model]
  (mst/render-file "_layout" (merge {:page-content (mst/render-file file model)} model)))

(defn java-actors-1 []
  (render-page "java_actors_1"
    {:page-title "Java Actors with Akka (Part 1)"
     :page-description "Describes how to use Akka framework in Java"}))

(defn java-actors-2 []
  (render-page "java_actors_2"
    {:page-title "Java Actors with Akka (Part 2)"
     :page-description "Describes how to use Akka framework in Java"}))

(defn java-repl []
  (render-page "java_repl"
    {:page-title "Java REPL"
     :page-description "Implementation of Read-Eval-Print-Loop for Java language"}))

(defn games []
  (render-page "games"
    {:page-title "Games"
     :page-description "Games portfolio"}))

(defn not-found []
  (render-page "not_found"
    {:page-title "404 - Not Found"}))