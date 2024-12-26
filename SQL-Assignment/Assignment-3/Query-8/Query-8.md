## QUESTION 8:  
**How many orders with a single return were recorded in the last month?**

### Query:
```sql
SELECT COUNT(*) AS Single_Return_Orders_Count
FROM (
   SELECT ORDER_ID, RETURN_ID
   FROM return_item ri
   GROUP BY ORDER_ID
   HAVING COUNT(RETURN_ID) = 1
) AS Order_Count;
```

| Type   |  Cost  | Rows |
|--------|--------|------|
| select | 227.95 | 2004 |
