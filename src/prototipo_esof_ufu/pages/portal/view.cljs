(ns prototipo-esof-ufu.pages.portal.view)

(defn index []
  [:div {:class "w-full min-h-screen flex justify-center items-center relative flex-col gap-9"}
   [:div {:class "bg-background-pizza absolute filter-background w-full min-h-screen flex justify-center items-center flex-col gap-9 w-full bg-no-repeat bg-[length:1920px_1080px] -z-10"}]
   [:div {:class "absolute top-0 w-full text-center bg-[#e40301] py-6 px-10 z-50"}
    [:nav
     [:ul {:class "flex justify-start gap-6 w-2/4"}
      [:li [:button {:class "font-bold text-[1.3rem] py-2 px-5 bg-[#ff4c58] rounded-md text-white"} "Home"]]
      [:li [:button {:class "font-bold text-[1.3rem] py-2 px-5 rounded-md text-white"} "Cardápio"]]
      [:li [:button {:class "font-bold text-[1.3rem] py-2 px-5 rounded-md text-white"} "Delivery"]]
      [:li [:button {:class "font-bold text-[1.3rem] py-2 px-5 rounded-md text-white"} "Contato"]]]]]
   [:span {:class "text-base font-bold text-white"} "20 Anos de Tradição"]
   [:span {:class "text-4xl font-bold text-white"} "Pizzaria @nome"]
   [:span {:class "text-3xl font-bold text-white"} "Bem-vindo!"]
   [:div {:class "flex flex-row"}
    [:button {:class "text-white bg-red-700 hover:bg-red-800 focus:outline-none focus:bg-red-900 font-medium rounded-full text-base px-5 py-2.5 text-center mr-2 mb-2 cursor-pointer"} "Peça já a sua!"]
    [:button {:class "text-white bg-yellow-700 hover:bg-yellow-800 focus:outline-none focus:bg-yellow-900 font-medium rounded-full text-base px-5 py-2.5 text-center mr-2 mb-2 cursor-pointer"} "Reserve sua mesa!"]]])