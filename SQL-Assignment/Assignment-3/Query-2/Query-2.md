
# SQL Query Documentation

## Question 2:  
**Leading up to the New Year, what is the count of orders shipped from stores in the 25 days preceding the New Year?**

### Query:
```sql
SELECT
    COUNT(*) AS Total_Orders
FROM
    order_shipment os
JOIN shipment s 
    ON os.SHIPMENT_ID = s.SHIPMENT_ID
    AND os.ORDER_ID = s.PRIMARY_ORDER_ID
    AND s.STATUS_ID = "SHIPMENT_SHIPPED"
JOIN facility f 
    ON s.ORIGIN_FACILITY_ID = f.FACILITY_ID
JOIN facility_type ft 
    ON f.FACILITY_TYPE_ID = ft.FACILITY_TYPE_ID
WHERE
    ft.PARENT_TYPE_ID = "PHYSICAL_STORE"
    AND s.CREATED_DATE >= "2023-12-07"
    AND s.CREATED_DATE <= "2024-01-01";
```

---

### Query Cost Analysis:

| **Type**   |  **Cost** | **Rows** |
|------------|-----------|----------|
| Select     |  4484.09  | 19023    |

---

### Explanation:
- **Objective:** Calculate the total number of orders shipped from physical stores between December 7, 2023, and January 1, 2024.
- **Key Conditions:**
  - Shipment status must be `SHIPMENT_SHIPPED`.
  - Origin facility must belong to the physical store type (`ft.PARENT_TYPE_ID = "PHYSICAL_STORE"`).
  - Shipments created within the specified 25-day timeframe.

--- 
