
# SQL Query Documentation

## Question 3:  
**In the period following the New Year, what is the number of orders shipped from stores in the first 25 days?**

### Query:
```sql
SELECT *
FROM
    order_shipment os
JOIN shipment s 
    ON os.SHIPMENT_ID = s.SHIPMENT_ID 
    AND os.ORDER_ID = s.PRIMARY_ORDER_ID
JOIN facility f 
    ON s.ORIGIN_FACILITY_ID = f.FACILITY_ID
JOIN facility_type ft 
    ON f.FACILITY_TYPE_ID = ft.FACILITY_TYPE_ID
WHERE
    ft.PARENT_TYPE_ID = "PHYSICAL_STORE"
    AND s.STATUS_ID = "SHIPMENT_SHIPPED"
    AND s.CREATED_DATE >= "2024-01-01" 
    AND s.CREATED_DATE <= "2024-01-25";
```

---

### Query Cost Analysis:

| **Type**   | **Cost** | **Rows** |
|------------|----------|----------|
| Select     | 4484.09  | 19023    |

---

### Explanation:
- **Objective:** Calculate the total number of orders shipped from physical stores in the first 25 days of January 2024.
- **Key Conditions:**
  - Shipment status must be `SHIPMENT_SHIPPED`.
  - Origin facility must belong to the physical store type (`ft.PARENT_TYPE_ID = "PHYSICAL_STORE"`).
  - Shipments created within the specified timeframe (January 1, 2024, to January 25, 2024).

--- 
