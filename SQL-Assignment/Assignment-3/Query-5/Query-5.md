## QUESTION 5:  
**In New York, which product has the highest sales?**

### Query:
```sql
SELECT oi.PRODUCT_ID, SUM(oi.UNIT_PRICE) AS Sale_in_$
FROM order_item oi
JOIN order_contact_mech ocm ON oi.ORDER_ID = ocm.ORDER_ID
JOIN postal_address pa ON ocm.CONTACT_MECH_ID = pa.CONTACT_MECH_ID AND pa.CITY = "New York"
GROUP BY oi.PRODUCT_ID
ORDER BY Sale_in_$ DESC;
```

| Type   | Cost     | Rows  |
|--------|----------|-------|
| select | 13305.09 | 10602 |

