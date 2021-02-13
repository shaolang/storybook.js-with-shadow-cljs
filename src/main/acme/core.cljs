(ns acme.core
  (:require [reagent.dom :refer [render]]))

(defn header [text]
  [:h1 text])

(defn init []
  (render [header "Hello, World!"]
          (js/document.getElementById "app")))
