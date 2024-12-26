## QUESTION 9:  
**Find all the orders whose two or more items are canceled but the orders are still in the approved status.**  

---

### Query:
```sql
SELECT 
    oh.ORDER_ID, 
    oi.ORDER_ITEM_SEQ_ID, 
    oh.ORDER_TYPE_ID, 
    oh.STATUS_ID AS ORDER_STATUS, 
    oi.STATUS_ID AS ITEM_STATUS
FROM 
    order_header oh
JOIN 
    order_item oi ON oh.ORDER_ID = oi.ORDER_ID
    AND oi.STATUS_ID = 'ITEM_CANCELLED'
WHERE 
    oh.STATUS_ID = 'ORDER_APPROVED'
GROUP BY 
    oh.ORDER_ID
HAVING 
    COUNT(oi.ORDER_ITEM_SEQ_ID) >= 2;

```

| Type   | Cost     | Rows  |
|--------|----------|-------|
| select | 22660.75 | 40941 |
