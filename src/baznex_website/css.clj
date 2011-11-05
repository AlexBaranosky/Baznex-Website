(ns baznex-website.css
  (:use cssgen))

(def fldi (mixin :float :left
                 :display :inline))

(def emphasis (mixin :color :#6bffbd))
(def de-emph (mixin :color :#91979d))
(def dark-background (mixin :background :#2a2b2b
                            :color :#d1d9e1))

(def light-text (mixin :color :#d1d9e1))
(def box (mixin :border-radius :8px
                :padding :10px))
(def light-box (mixin box
                      :background :#474949
                      :border [:2px :solid :#616363]))
(def emph-box (mixin box
                     :background :#3f634d
                     :border [:2px :solid :#3c8455]))


(defn baznex-css []
  (css
    (rule "body"
          dark-background
          :padding [:60px :80px]
          :font-family "'Helvetica Neue',Helvetica,Verdana")
    (rule "#wrapper"
          fldi
          :padding-bottom :100px)
    (rule "h1"
          :margin-bottom :0px
          light-text)
    (rule "h2"
          :margin-top :10px
          :margin-left :60px
          :font-size :18px
          :font-weight :normal)
    (rule "code"
          fldi
          light-box
          :font-family "Monaco, Consolas, 'Courier New'")
    (rule "#header"
          :margin-bottom :50px)
    (rule "ul"
          (rule "li"
                fldi
                :margin-bottom :55px
                :width "100%"
                (rule ".left"
                      fldi
                      :width "45%"
                      :margin-right "5%"
                      (rule "p"
                            :padding 0
                            :margin 0
                            :font-size :18px))
            (rule ".right"
                      fldi
                      :width "50%"
                      (rule "code"
                            :width "100%")
                      (rule "p"
                            :max-width :440px))))

    (rule "#not-found"
          :text-align :center
          :width :600px
          :margin [:0px :auto]
          :margin-top :200px
          (rule "h1"
                emphasis
                :font-size :32px
                :margin-bottom :20px
                ))

    (rule "#exception"
          :max-width :900px
          :min-width :500px
          (rule "h1"
                :font-size :24px)
          (rule "ul"
                :margin 0
                :padding 0
                :margin-top :20px
                :list-style :none)
          (rule "table"
                :width "100%"
                :margin-top :20px
                :border-collapse :collapse)
          (rule "tr"
                light-box
                :margin-bottom :10px
                :width "100%")
          (rule "td"
                :padding :10px)

          (rule ".dt"
                :text-align :right)
          (rule ".dd"
                de-emph
                :margin 0
                :padding-left "5%")
          (rule "h1 span"
                :font-size :18px
                :font-weight :normal
                de-emph)
          (rule ".mine"
                emph-box))
    ))