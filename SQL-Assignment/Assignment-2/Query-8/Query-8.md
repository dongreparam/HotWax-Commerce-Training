## QUESTION 8:  
**Find all the orders whose two or more items are completed but the orders are still in the approved status.**  


### Query:
```sql
SELECT 
    oh.ORDER_ID, 
    COUNT(oi.ORDER_ITEM_SEQ_ID) AS ITEM_COUNT, 
    oh.STATUS_ID
FROM 
    order_header oh
JOIN 
    order_item oi ON oh.ORDER_ID = oi.ORDER_ID
WHERE 
    oh.STATUS_ID = 'ORDER_APPROVED'
    AND oi.STATUS_ID = 'ITEM_COMPLETED'
GROUP BY 
    oh.ORDER_ID
HAVING 
    COUNT(oi.ORDER_ITEM_SEQ_ID) >= 2;

```
| Type   | Cost     | Rows  |
|--------|----------|-------|
| select | 21799.11 | 40941 |

