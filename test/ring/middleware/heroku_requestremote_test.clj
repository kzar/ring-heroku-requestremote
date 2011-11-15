(ns ring.middleware.heroku-requestremote-test
  (:use clojure.test
        ring.middleware.heroku-requestremote))

(def handler (wrap-heroku-requestremote identity))

(deftest adding-heroku-remote-ip
  (let [result (handler {:remote-ip "wrong" :headers {"x-forwarded-for" "real"}})]
    (is (= (:remote-ip "real" result)))))

(deftest leaving-normal-remote-ip
  (let [result (handler {:remote-ip "right"})]
    (is (= (:remote-ip "right" result)))))