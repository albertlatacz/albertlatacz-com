(ns albertlatacz.pages
  (:require [cheshire.core :as json]
            [stencil.core :as mst]))

(defn render-page [file model]
  (mst/render-file "_layout" (merge {:page-content (mst/render-file file model)} model)))

(defn java-repl []
  (render-page "java_repl"
    {:page-name :java-repl
     :page-title "Java REPL"
     :page-description "Implementation of Read-Eval-Print-Loop for Java language"}))

(defn glue-pdfs []
  (render-page "glue_pdfs"
    {:page-name :glue-pdfs
     :page-title "Glue PDFs"
     :page-description "Simple PDF merging tools"}))

(defn games []
  (render-page "games"
    {:page-name :games
     :page-title "Games"
     :page-description "Games portfolio"}))

(defn not-found []
  (render-page "not_found"
    {:page-title "404 - Not Found"}))