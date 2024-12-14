### SQL Query: Total Number of Orders from New York

```sql
-- QUESTION 4 - 
-- What is the total number of orders originating from New York?

SELECT COUNT(*) AS Total_Order
FROM order_contact_mech ocm
JOIN postal_address pa 
  ON ocm.CONTACT_MECH_ID = pa.CONTACT_MECH_ID
WHERE pa.CITY = "New York"
;
```

### Query Execution Statistics

| Type   | Cost    | Rows  |
|--------|---------|-------|
| SELECT | 8778.08 | 10601 |
