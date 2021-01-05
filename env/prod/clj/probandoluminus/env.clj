(ns probandoluminus.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[probandoluminus started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[probandoluminus has shut down successfully]=-"))
   :middleware identity})
