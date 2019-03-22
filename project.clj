(defproject com.stuartsierra/dependency "0.2.0-VALUTICO1"
  :description "A data structure for representing dependency graphs"
  :url "https://github.com/stuartsierra/dependency"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.10.0"]]}
             :clj-1.7.0 {:dependencies [[org.clojure/clojure "1.7.0"]]}}
  :repositories [["valutico-snapshots" {:url "https://nexus.valutico.com/repository/maven-snapshots" :creds :gpg}]
                 ["valutico-releases" {:url "https://nexus.valutico.com/repository/maven-releases" :creds :gpg}]])
