(ns clojure-workshop.core
  "Core module for a system"
  (:require [clojure.string :refer [upper-case]]))

(upper-case "Hello world")
(-> 2 (+ 3) (* 100 200) (/ 0))