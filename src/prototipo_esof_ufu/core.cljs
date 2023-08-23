(ns prototipo-esof-ufu.core
  (:require
   [reagent.dom :as rdom]
   [re-frame.core :as re-frame]
   [prototipo-esof-ufu.events :as events]
   [prototipo-esof-ufu.subs :as subs]
   [prototipo-esof-ufu.pages.portal.view :as portal]
   [cljs.core.match :as m]
   ))


(defn index []
  (fn []
    (let [tela-ativa (re-frame/subscribe [::subs/tela-ativa])]
      (m/match [@tela-ativa]
        [:portal] [portal/index]
        :else [:div "FALHA AO BUSCAR TELA ATIVA!!!!"]))))

(defn ^:dev/after-load mount-root []
  (re-frame/clear-subscription-cache!)
  (let [root-el (.getElementById js/document "app")]
    (rdom/unmount-component-at-node root-el)
    (rdom/render [index] root-el)))

(defn init []
  (re-frame/dispatch-sync [::events/initialize-db])
  (mount-root))
