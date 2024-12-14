## QUESTION:  
**Fetch the following details for Shopify orders with completed items within July 2023:**  

### Required Columns:  
- `ORDER_ID`  
- `ORDER_ITEM_SEQ_ID`  
- `SHOPIFY_PRODUCT_ID`  
- `SHOPIFY_ORDER_ID`  
- `STATUS_ID`  
- `STATUS_DATETIME`  

---

### Query:
```sql
SELECT
    oi.ORDER_ID,
    oi.ORDER_ITEM_SEQ_ID,
    gi.PRODUCT_ID AS SHOPIFY_PRODUCT_ID,
    oi2.ORDER_ID AS SHOPIFY_ORDER_ID,
    os.STATUS_ID,
    os.STATUS_DATETIME
FROM
    order_item oi
JOIN 
    order_identification oi2 ON
    oi.ORDER_ID = oi2.ORDER_ID
    AND oi2.ORDER_IDENTIFICATION_TYPE_ID = 'SHOPIFY_ORD_ID'
JOIN 
    good_identification gi ON
    oi.PRODUCT_ID = gi.PRODUCT_ID
    AND gi.GOOD_IDENTIFICATION_TYPE_ID = 'SHOPIFY_PROD_ID'
JOIN 
    order_status os ON
    oi.ORDER_ID = os.ORDER_ID
    AND oi.ORDER_ITEM_SEQ_ID = os.ORDER_ITEM_SEQ_ID
    AND os.STATUS_ID = 'ITEM_COMPLETED'
    AND os.STATUS_DATETIME >= '2023-07-01 00:00:00.000'
    AND os.STATUS_DATETIME <= '2023-07-31 23:59:59.999';

```

| Type   | Cost     | Rows   |
|--------|----------|--------|
| select | 45282.18 | 120605 |
