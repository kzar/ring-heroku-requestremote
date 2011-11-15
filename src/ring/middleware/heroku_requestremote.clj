(ns ring.middleware.heroku-requestremote)

(defn wrap-heroku-requestremote
  "Function used to add the Heroku request remote ip fixer middleware to the Ring stack"
  [handler]
  (fn [req]
    (handler
     (update-in req [:remote-addr]
                (fn [remote real-remote] (or real-remote remote))
                (get (:headers req) "x-forwarded-for")))))