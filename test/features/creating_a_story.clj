(ns features.creating_a_story
  (:require [clojure.test :refer :all]
            [kerodon.core :refer :all]
            [kerodon.test :refer :all]
            [getinvolved.handler :refer [app]]
            [getinvolved.browser :as browser]
            [clj-webdriver.taxi :as taxi]))

(deftest test-creating-a-story
  (testing "Creating stories"
    (-> (session app)
        (visit "/")
        (has (regex? "(?is).*Welcome to getinvolved.*")
             "Has a title"))))