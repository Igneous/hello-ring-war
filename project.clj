(defproject hello-ring "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :plugins [[lein-ring "0.12.5"]]
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [javax.servlet/servlet-api "2.5"]
                 [ring "1.8.1"]]
  :repl-options {:init-ns hello-ring.core}
  :source-paths ["src/"]
  :ring {:handler hello-ring.core/handler}
  :main hello-ring.core)
