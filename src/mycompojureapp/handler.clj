(ns mycompojureapp.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app-routes
  (GET "/" [] "Hello World!!!!")
  (GET "/hoge" [] "GET /hoge")
  (GET "/hoge/fuga" [] "GET /hoge/fuga")
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
