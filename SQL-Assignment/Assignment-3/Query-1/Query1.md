
# SQL Query Documentation

## Question 1:  
**How many single-item orders were fulfilled from warehouses in the last month?**

### Query:
```sql
SELECT
    oi.ORDER_ID,
    COUNT(oi.ORDER_ITEM_SEQ_ID) AS Items_In_An_Order,
    oisg.FACILITY_ID,
    ft.FACILITY_TYPE_ID,
    ft.PARENT_TYPE_ID,
    oh.ORDER_DATE
FROM
    order_header oh
JOIN order_item oi 
    ON oi.ORDER_ID = oh.ORDER_ID
    AND oh.STATUS_ID = 'ORDER_COMPLETED'
JOIN order_item_ship_group oisg 
    ON oi.ORDER_ID = oisg.ORDER_ID
    AND oi.SHIP_GROUP_SEQ_ID = oisg.SHIP_GROUP_SEQ_ID
JOIN facility f 
    ON oisg.FACILITY_ID = f.FACILITY_ID
JOIN facility_type ft 
    ON f.FACILITY_TYPE_ID = ft.FACILITY_TYPE_ID
    AND ft.PARENT_TYPE_ID = 'DISTRIBUTION_CENTER'
WHERE
    oh.ORDER_DATE >= '2024-08-01 00:00:00.000'
    AND oh.ORDER_DATE <= '2024-09-01 00:00:00.000'
GROUP BY
    oi.ORDER_ID
HAVING
    COUNT(oi.ORDER_ITEM_SEQ_ID) = 1;
```

---

### Query Cost Analysis:

| **Type**   | **Cost** | **Rows** |
|------------|----------|----------|
| Select     | 15574.65 | 40944    |

---

### Explanation:
- **Objective:** Identify the number of orders with a single item that were completed in the last month (August 2024) from distribution centers.
- **Key Conditions:**
  - Orders completed (`oh.STATUS_ID = 'ORDER_COMPLETED'`).
  - Facility type restricted to warehouses (`ft.PARENT_TYPE_ID = 'DISTRIBUTION_CENTER'`).
  - Orders placed between August 1, 2024, and August 31, 2024.
  - Filter for single-item orders using `HAVING COUNT(oi.ORDER_ITEM_SEQ_ID) = 1`.

--- 
