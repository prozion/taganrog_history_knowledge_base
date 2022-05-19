(ns odysseus.text
  (:require
            [clojure.string :as s]
            ))

(defn remove-urls [text]
  (->
    text
    (s/replace #"https?://\S+" "")
    (s/replace #"\s+" " ")))

(defn make-markdown-link [text url]
  (let [url (if (s/starts-with? url "http") url (format "https://%s" url))]
    (format "[%s](%s)" text url)))

(defn make-html-link [text url]
  (let [url (if (s/starts-with? url "http") url (format "https://%s" url))]
    (format "<a href=\"%s\">%s</a>" url text)))