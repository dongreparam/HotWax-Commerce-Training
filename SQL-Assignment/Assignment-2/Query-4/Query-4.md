## QUESTION:  
**Fetch the following columns for created orders. These should be sales orders.**  
Columns:  
- `ORDER_ID`  
- `TOTAL_AMOUNT`  
- `PAYMENT_METHOD`  
- `SHOPIFY_ORDER_NAME`  

### Query:
```sql
SELECT
    oh.ORDER_ID,
    oh.GRAND_TOTAL AS Total_Amount,
    pmt.DESCRIPTION AS Payment_Method,
    oid.ID_VALUE AS Shopify_Order_Name
FROM
    order_header oh
JOIN 
    order_payment_preference op ON oh.ORDER_ID = op.ORDER_ID
JOIN 
    order_identification oid ON oh.ORDER_ID = oid.ORDER_ID
JOIN 
    payment_method_type pmt ON op.PAYMENT_METHOD_TYPE_ID = pmt.PAYMENT_METHOD_TYPE_ID
WHERE
    oh.ORDER_TYPE_ID = "SALES_ORDER"
    AND oid.ORDER_IDENTIFICATION_TYPE_ID = "SHOPIFY_ORD_NAME"
    AND oh.STATUS_ID = "ORDER_CREATED"
GROUP BY
    oh.ORDER_ID;


```

| Type   |   Cost  | Rows |
|--------|---------|------|
| select | 2581.25 | 1425 |

