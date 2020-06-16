(ns clojurefam.solution
  (:refer-clojure :exclude [def])
  (:require [clojure.spec.alpha :as s]
            [clojurefam.db :as db]
            [clojurefam.task :as task]))

(s/def ::code any?)
#_
(s/def ::solution-id
  (s/keys ::req [::code ::task/id]))

(defn register!)
