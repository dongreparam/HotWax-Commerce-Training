## QUESTION 7:  
**Fetch all the physical items ordered in the month of September 2023.**  

---

### Query:
```sql
SELECT
    oi.ORDER_ID,
    oi.ORDER_ITEM_SEQ_ID,
    p.PRODUCT_ID,
    p.PRODUCT_TYPE_ID,
    pt.IS_PHYSICAL,
    pt.IS_DIGITAL,
    oh.ORDER_DATE
FROM
    order_header oh
JOIN 
    order_item oi ON
    oh.ORDER_ID = oi.ORDER_ID
JOIN 
    product p ON
    oi.PRODUCT_ID = p.PRODUCT_ID
JOIN 
    product_type pt ON
    p.PRODUCT_TYPE_ID = pt.PRODUCT_TYPE_ID
WHERE
    pt.IS_PHYSICAL = 'Y'
    AND oh.ORDER_DATE >= "2023-09-01 00:00:00.000"
    AND oh.ORDER_DATE <= "2023-09-30 23:59:59.999";

```

| Type   | Cost     | Rows  |
|--------|----------|-------|
| select | 21997.47 | 81906 |
