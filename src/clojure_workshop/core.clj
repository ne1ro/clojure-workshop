(ns clojure-workshop.core
  "Core module for a system"
  (:require [compojure.core :refer :all]
            [compojure.route :as route]))

(defroutes app
  (GET "/" [] "<h1>Kek Pek</h1>")
  (route/not-found "<h1>Page not found</h1>"))