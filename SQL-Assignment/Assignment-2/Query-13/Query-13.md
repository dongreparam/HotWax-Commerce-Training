## Fetch the following details for orders completed in August of 2023.

---

### Query to Fetch the Required Details:
```sql
SELECT 
    oi.PRODUCT_ID,
    p.PRODUCT_TYPE_ID,
    oh.PRODUCT_STORE_ID,
    oi.QUANTITY,
    oi.CANCEL_QUANTITY,
    p.INTERNAL_NAME,
    f.FACILITY_TYPE_ID,
    oh2.ORDER_HISTORY_ID,
    oh.ORDER_ID,
    oi.ORDER_ITEM_SEQ_ID,
    oi.SHIP_GROUP_SEQ_ID,
    oh.EXTERNAL_ID
FROM 
    order_header oh
JOIN 
    order_status os ON oh.ORDER_ID = os.ORDER_ID
    AND os.STATUS_ID = 'ORDER_COMPLETED'
    AND os.STATUS_DATETIME > '2023-08-01 00:00:00.000'  
    AND os.STATUS_DATETIME < '2023-08-31 00:00:00.000'
JOIN 
    order_item oi ON oh.ORDER_ID = oi.ORDER_ID
JOIN 
    product p ON oi.PRODUCT_ID = p.PRODUCT_ID
JOIN 
    order_item_ship_group oisg ON oi.SHIP_GROUP_SEQ_ID = oisg.SHIP_GROUP_SEQ_ID
JOIN 
    facility f ON oisg.FACILITY_ID = f.FACILITY_ID
JOIN 
    order_history oh2 ON oh.ORDER_ID = oh2.ORDER_ID;
