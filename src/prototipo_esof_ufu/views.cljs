(ns prototipo-esof-ufu.views
  (:require
   [re-frame.core :as re-frame]
   [prototipo-esof-ufu.subs :as subs]
   ))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [:h1 {:class "w-full bg-black min-h-screen text-white"}
      "Hello from me " @name]
     ]))
