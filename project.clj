(defproject org.clojars.torbjornvatn/clj-TEMPer1 "0.1.0-SNAPSHOT"
  :description "A small clojure program that interfaces with a TEMPer1 device"
  :license {:name "WTFPL – Do What the Fuck You Want to Public License"
            :url "http://www.wtfpl.net/"}
  :url "https://github.com/torbjornvatn/clj-TEMPer1"
  :repositories [["ailis" "http://nexus.ailis.de/content/groups/public"]]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojars.torbjornvatn/hidapi "1.1"]
                 [org.clojure/tools.logging "0.2.6"]
                 [expectations "1.4.52"]]
  :main clj-TEMPer1.core)
;;   :jvm-opts ["-Djava.library.path=native/macosx/x86_64/"])
;;   :jvm-opts ["-Djava.library.path=target/native/mac"])
