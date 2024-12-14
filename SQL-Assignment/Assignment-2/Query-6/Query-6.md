## QUESTION 6:  
**Fetch all the physical items completed from Warehouse in September 2023.**  

---

### Query:
```sql
SELECT
    *
FROM
    order_item oi
JOIN 
    order_item_ship_group oisg ON
    oi.SHIP_GROUP_SEQ_ID = oisg.SHIP_GROUP_SEQ_ID
JOIN 
    facility f ON
    oisg.FACILITY_ID = f.FACILITY_ID
JOIN 
    facility_type ft ON
    f.FACILITY_TYPE_ID = ft.FACILITY_TYPE_ID
    AND ft.PARENT_TYPE_ID = "DISTRIBUTION_CENTER"
JOIN 
    product p ON
    oi.PRODUCT_ID = p.PRODUCT_ID
JOIN 
    product_type pt ON
    pt.PRODUCT_TYPE_ID = p.PRODUCT_TYPE_ID 
    AND pt.IS_PHYSICAL = "Y"
JOIN 
    order_status os ON 
    oi.ORDER_ID = os.ORDER_ID 
    AND os.STATUS_ID = "ITEM_COMPLETED"
    AND os.STATUS_DATETIME >= '2023-09-01' 
    AND os.STATUS_DATETIME <= '2023-09-30';

```

| Type   |  Cost         | Rows   |
|--------|---------------|--------|
| select | 32,370,175.42 | 121750 |
