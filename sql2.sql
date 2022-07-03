-- Consult sells according to the Kind of document and number document -- 
SELECT cus_kind_document
FROM custom
where cus_kind_document = 'CC' and cus_document = '1017254874';

-- Consult the supplier of a product -- 
SELECT prod_suppl
FROM products
where prod_name = 'Soda';