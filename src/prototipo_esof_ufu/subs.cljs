(ns prototipo-esof-ufu.subs
  (:require
   [re-frame.core :as re-frame]))

(re-frame/reg-sub
 ::tela-ativa
 (fn [db]
   (:tela-ativa db)))