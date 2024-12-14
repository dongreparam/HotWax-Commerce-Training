## QUESTION 7:  
**On a city-wise basis, what is the analysis of returns?**

### Query:
```sql
SELECT pa.CITY, COUNT(rh.RETURN_ID)
FROM return_header rh
JOIN return_contact_mech rcm ON rh.RETURN_ID = rcm.RETURN_ID
JOIN postal_address pa ON rcm.CONTACT_MECH_ID = pa.CONTACT_MECH_ID
GROUP BY pa.CITY
ORDER BY COUNT(rh.RETURN_ID) DESC;

```
| Type   | Cost   | Rows |
|--------|--------|------|
| select | 58.96  | 50   |
