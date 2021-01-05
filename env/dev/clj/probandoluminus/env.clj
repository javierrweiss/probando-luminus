(ns probandoluminus.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [probandoluminus.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[probandoluminus started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[probandoluminus has shut down successfully]=-"))
   :middleware wrap-dev})
