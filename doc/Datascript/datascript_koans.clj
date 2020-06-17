;; Very WIP doc to put Datascript koans based on the Datascript explorer

;; Very WIP doc to put Datascript koans based on the Datascript explorer

;; Number: 001
;; Theme:
;; Difficulty: 

;; Find all of the node titles in the database.

;; Hint:
;; (d/q '[symbol
;;    keyword
;;    vector ]
;;    @athens/db)

(d/q '[
       ]
     @athens/db)

;; Answer:
;;      
;; (d/q '[:find ?title 
;;     :where 
;;     [_ :node/title ?title]]
;;     @athens/db)```

;; Number: 002
;; Theme:
;; Difficulty:

;; Find the entity ids (?idx) **and** the block ids of all unique blocks.

(d/q '[
       ]
     @athens/db)

;;  Answer
;;  
;; (d/q '[:find ?idx ?uid
;;        :where [?idx :block/uid ?uid]]
;;     @athens/db)

;; Number: 003
;; Theme:
;; Difficulty:
;; 
;; - Find all of the node titles of all open blocks

(d/q '[
       			]
    @athens/db)

; Answer: 
;
; (d/q '[:find ?title
;        :where 
;       [?e :block/open true]
;       [?e :node/title ?title]]
;     @athens/db)



;    Number: 004
;    Theme:
;    Difficulty: 

;    Find the unique ids of all the children of the 
;    "Clojure from the Ground Up" block

(d/q '[
       ]
     @athens/db)

; Answer:
;    
; (d/q '[:find ?uid
;       :where
;       [?e :node/title "Clojure from the Ground Up"]
;       [?e :block/children ?ch]
;       [?ch :block/uid ?uid]

;       ]
;     @athens/db)
     

;    Number: 005
;    Theme:
;    Difficulty:

;    Find the string value and edit times of all the 
;    children of the block titled "Hyperlink"

(d/q '[
      ]
    @athens/db)

; Answer

; (d/q '[:find ?string ?time
;       :where
;       [?e :node/title "Hyperlink"]
;       [?e :block/children ?ch]
;       [?ch :block/string ?string]
;       [?ch :edit/time ?time]
;       ]
;     @athens/db)
    
;    Number: 006
;    Theme:
;    Difficulty:

;; Find all of the unique attribute values for the 
;; node titled "[[Nat Eliason]]: Effortless Output with Roam"

(d/q '[]
     @athens/db)

; Answer:
; 
; (d/q '[:find ?attr
;       :where
;      [?e :node/title "Niklas Luhmann"]
;      [?e _ ?attr]]
;    @athens/db)
