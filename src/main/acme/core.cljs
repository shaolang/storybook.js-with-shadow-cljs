(ns acme.core
  (:require [acme.components.header :refer [header]]
            [reagent.dom :refer [render]]))

(defn init []
  (render [header "Hello, World!"]
          (js/document.getElementById "app")))
