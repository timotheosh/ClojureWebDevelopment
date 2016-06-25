# My first post
[My First Post](/my-first-post/)

It's pretty short for now. Here's our project.clj:

<pre><code class="clj">
(defproject althusius-net "0.1.0-SNAPSHOT"
  :description "Althusius.net Website"
  :url "http://althusius.net"
  :license {:name "Apache 2.0"
            :url "https://opensource.org/licenses/Apache-2.0"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [stasis "1.0.0"]
                 [ring "1.2.1"]
                 [hiccup "1.0.5"]
                 [me.raynes/cegdown "0.1.1"]]
  :ring {:handler althusius-net.web/app}
  :profiles {:dev {:plugins [[lein-ring "0.8.10"]]}})
</code></pre>