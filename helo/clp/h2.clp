(deftemplate firma
(slot nazwa (type string))
(slot cena-przewozu (type float))
(slot cena-za�adunku (type float))
(multislot zasi�g (type string))
(multislot flota (type string))
(slot obs�uguje-specjalne)
(slot obs�uguje-ch�odni�)
(slot �adowno�� (type float))
)