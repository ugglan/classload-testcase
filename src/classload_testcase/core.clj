(ns classload-testcase.core
  (:import (com.xerox.amazonws.sqs2 QueueService SQSException)))

(defn connect []
  (try
   (.getOrCreateMessageQueue (QueueService. "not" "needed") "test-queue")
   (catch SQSException e
     (if (> (.indexOf (str e) "InvalidClientTokenId") -1)
       "Expected error"
       (throw e)))))
