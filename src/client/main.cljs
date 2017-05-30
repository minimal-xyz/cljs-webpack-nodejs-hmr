
(ns client.main
  (:require [client.lib :as lib]
            [hsl.core :as hsl-core]))

(def npm-hsl (js/require "hsl"))

(println "Loading main.cljs")

(defn render! []
  (println lib/lib-data)
  (println "Trying jar" (hsl-core/hsl 10 20 30 0.3))
  (println "Trying npm" (npm-hsl 10 20 30 0.3))
  (println "Rendered!"))

(defn init []
  (println "init"))

(defn start []
  (println "start")
  (render!)
  {::app true})

(defn stop [app]
  (prn [:stop app]))
