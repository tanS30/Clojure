(defproject m-clj "0.1.0-SNAPSHOT"
  :description "Code for Mastering Clojure"
  :main ^:skip-aot m-clj.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/math.numeric-tower "0.0.4"]
                 [defun "0.2.0-RC"]
                 [org.clojure/core.match "0.2.2"
                  :exclusions [org.clojure/tools.analyzer.jvm]]
                 [org.clojure/core.typed "0.3.0"]])
