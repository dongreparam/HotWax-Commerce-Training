# Question 11
## Fetch all the customers created in June 2023.

---

### Query:
```sql
SELECT 
    p.PARTY_ID, 
    pr.ROLE_TYPE_ID, 
    rt.PARENT_TYPE_ID
FROM 
    party p
JOIN 
    party_role pr ON p.PARTY_ID = pr.PARTY_ID
JOIN 
    role_type rt ON pr.ROLE_TYPE_ID = rt.ROLE_TYPE_ID
WHERE 
    rt.PARENT_TYPE_ID = 'CUSTOMER'
    AND p.CREATED_DATE >= '2023-06-01 00:00:00.000'
    AND p.CREATED_DATE <= '2023-06-30 23:59:59.999';


```


| Type   | Cost     | Rows  |
|--------|----------|-------|
| select | 11089.64 | 34129 |
