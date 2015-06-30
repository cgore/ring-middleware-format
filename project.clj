(defproject cgore/ring-middleware-format "0.7.4"
  :description "Ring middleware for parsing parameters and emitting
  responses in various formats (mainly JSON, YAML and Transit out of
  the box)"
  :url "https://github.com/cgore/ring-middleware-format"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/core.memoize "0.5.7"]
                 [ring "1.3.2"]
                 [cheshire "5.5.0"]
                 [org.clojure/tools.reader "0.9.2"]
                 [com.google.guava/guava "18.0"]
                 [com.ibm.icu/icu4j "55.1"]
                 [clj-yaml "0.4.0"]
                 [cgore/clojure-msgpack "1.2.0"]
                 [com.cognitect/transit-clj "0.8.275"]]
  :plugins [[codox "0.8.12"]]
  :codox {:src-dir-uri "http://github.com/cgore/ring-middleware-format/blob/master/"
          :src-linenum-anchor-prefix "L"
          :defaults {:doc/format :markdown}}
  :profiles {:1.7 {:dependencies [[org.clojure/clojure "1.7.0-alpha4"]]}}
  :aliases {"all" ["with-profile" "dev:dev,1.7"]
            "test-ancient" ["test"]})
