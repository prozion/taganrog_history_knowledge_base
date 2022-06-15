(ns taganrog-history-bot.globals)

; (def settings
;   (read-string (slurp "src/tgn_history_bot/settings.clj")))

(def settings {
    :token "5223345298:AAGZ8JaU-kY5atE97EAVuAlX7ScuBXGSAEs" ; history
    :name "История Таганрога"
    :username "taganrog_bot"
    :bot-url "https://t.me/taganrog_bot"
    :webhook-url "https://bots.denis-shirshov.ru/tgn-history"
    ; :wikimapia-api-key "34FA424A-BD2C7000-C26DADD4-E4E6B789-33EB6DB7-D6B4ED09-07BA07FA-CAC4C15B"
    ; :wikimapia-api-key "34FA424A-A88E454B-8A03C6DA-91B76601-6DDA60A2-D99A9BB9-BA46AA66-8315E1D"
    ; :wikimapia-api-key "34FA424A-42DD6E49-793FE107-A02DDAB9-4126E5EF-FBD9FE9A-E0AFC92B-E72BE864"
    ; :wikimapia-api-key "34FA424A-F26E0D06-90530930-3E454EEE-17DE81B0-80BD3A22-32A32CFB-CB8E52A3"

    ; :wikimapia-api-key "34FA424A-386C2057-EEE39F66-EEA21F9B-B0473636-C15748B5-C99DBC55-4BBECC8C"
    ; :wikimapia-api-key "34FA424A-921E0BE1-B617C3E2-A2EE12D9-7786BDD3-66B80613-DFC47BD4-BDE2D7A3"
    ; :wikimapia-api-key "34FA424A-883A8D23-24D547CF-4822C66D-EA0FE669-19CA81E0-95708C8D-46DA8326"
    ; :wikimapia-api-key "34FA424A-642696E2-89F358E6-9976CD20-2AC90FE4-1B2D1A7C-1793ECBC-511AEF89"
    ; :wikimapia-api-key "34FA424A-68BEF3E7-BBEB5064-08D0F8C1-51391B11-D9AB3874-8A746087-34D68A21"
    ; :wikimapia-api-key "34FA424A-79784022-17681029-EED5DF7A-2D463973-2C9910D4-A632836B-2AF3126B"
    ; :wikimapia-api-key "34FA424A-36A220E2-6C889181-1C989BB6-0DB9B727-0A134A39-CFB51E92-EE506309"

    ; :wikimapia-api-key "34FA424A-30572A3-BD314EC2-4281A92A-30C0A5C5-DC9B27C5-DC782CD9-EAB4B1E1"
    ; :wikimapia-api-key "34FA424A-FAA8548A-B2DD9F78-369A54B3-C7ADC830-21E093C2-95E84AAD-A0CC8CAA"
    ; :wikimapia-api-key "34FA424A-F12D3C40-85ECFFEA-B2CA55E7-458BC1A1-D1A8F094-7BEE5DCB-9F9CF78E"
    :wikimapia-api-key "34FA424A-6D1FEB-B335D4A2-BB409C98-1E7138EB-6BD114CC-2886F0A7-FC67E3FA"
    ; :wikimapia-api-key "34FA424A-3FB00B9A-E2ECD43C-54715D7C-F39D8F28-89CFDE87-532125BC-AAF803D3"
})

(def base-url (format "https://api.telegram.org/bot%s" (:token settings)))

(def DATABASE_PATH "/var/db/jena/taganrog-history")    
