## QUESTION:  
**Fetch the following columns for completed order items for sales orders of SM_STORE product store and that are physical items.**

**Columns to Fetch:**
- ORDER_ID
- ORDER_ITEM_SEQ_ID
- PRODUCT_ID
- PRODUCT_TYPE_ID
- IS_PHYSICAL
- IS_DIGITAL
- SALES_CHANNEL_ENUM_ID
- ORDER_DATE
- ENTRY_DATE
- STATUS_ID
- STATUS_DATETIME
- ORDER_TYPE_ID
- PRODUCT_STORE_ID

### Query:
```sql
SELECT
    oi.ORDER_ID,
    oi.ORDER_ITEM_SEQ_ID,
    p.PRODUCT_ID,
    p.PRODUCT_TYPE_ID,
    pt.IS_PHYSICAL,
    pt.IS_DIGITAL,
    oh.SALES_CHANNEL_ENUM_ID,
    oh.ORDER_DATE,
    oh.ENTRY_DATE,
    oi.STATUS_ID,
    os.STATUS_DATETIME
FROM
    order_header oh
JOIN order_item oi ON
    oh.ORDER_ID = oi.ORDER_ID
    AND oi.STATUS_ID = 'ITEM_COMPLETED'
JOIN product p ON
    oi.PRODUCT_ID = p.PRODUCT_ID
JOIN product_type pt ON
    p.PRODUCT_TYPE_ID = pt.PRODUCT_TYPE_ID
    AND pt.IS_PHYSICAL = 'Y'
    AND pt.IS_DIGITAL = 'N'
JOIN order_status os ON
    oi.ORDER_ID = os.ORDER_ID
WHERE
    oh.ORDER_TYPE_ID = 'SALES_ORDER'
    AND oh.PRODUCT_STORE_ID = 'SM_STORE';
```

| Type   | Cost     | Rows  |
|--------|----------|-------|
| select | 44868.26 | 40973 |
