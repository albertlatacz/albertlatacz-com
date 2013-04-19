(ns albertlatacz.pages
  (:use stencil.core))

(defn render-page [file model]
  (render-file "_layout" (merge {:page-content (render-file file model)} model)))

(defn java-actors-1 []
  (render-page "java_actors_1"
    {:page-title "Java Actors with Akka (Part 1)"
     :page-description "Describes how to use Akka framework in Java"}))

(defn java-actors-2 []
  (render-page "java_actors_2"
    {:page-title "Java Actors with Akka (Part 2)"
     :page-description "Describes how to use Akka framework in Java"}))

(defn not-found []
  (render-page "not_found" {:page-title "404 - Not Found"}))