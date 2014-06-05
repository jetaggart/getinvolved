(ns features.creating_a_story
  (:require [clojure.test :refer :all]
            [kerodon.core :refer :all]
            [kerodon.test :refer :all]
            [getinvolved.handler :refer [app]]))

(deftest test-creating-a-story
  (testing "Creating stories"
    (-> (session app)
        (visit "/")
        (has (regex? "(?is).*Get involved.*")
             "Has a title"))))