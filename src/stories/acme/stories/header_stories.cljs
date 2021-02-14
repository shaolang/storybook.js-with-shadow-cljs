(ns acme.stories.header-stories
  (:require [acme.components.header :refer [header]]
            [reagent.core :as r]))

(def ^:export default
  #js {:title     "Header Component"
       :component (r/reactify-component header)})

(defn ^:export HelloWorldHeader []
  (r/as-element [header "Hello, World!"]))

(defn ^:export GoodbyeSekaiHeader []
  (r/as-element [header "Goodbye, Sekai!"]))
