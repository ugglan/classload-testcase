(ns classload-testcase.core-test
  (:use [classload-testcase.core] :reload-all)
  (:use [clojure.test]))

(deftest run-as-test
  (is (= "Expected error" (connect))))
