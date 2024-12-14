## QUESTION:  
**Which physical store has the highest number of one-day shipped orders between November 1, 2024, and December 1, 2024?**

### Query:
```sql
SELECT
    f.FACILITY_ID, COUNT(*)
FROM
    order_item oi
JOIN order_status os ON
    oi.ORDER_ID = os.ORDER_ID
    AND oi.ORDER_ITEM_SEQ_ID = os.ORDER_ITEM_SEQ_ID
    AND os.STATUS_ID = "ITEM_COMPLETED"
JOIN order_item_ship_group oisg ON
    oi.SHIP_GROUP_SEQ_ID = oisg.SHIP_GROUP_SEQ_ID
    AND oi.ORDER_ID = oisg.ORDER_ID
    AND oisg.SHIPMENT_METHOD_TYPE_ID = "NEXT_DAY"
JOIN facility f ON
    oisg.FACILITY_ID = f.FACILITY_ID
JOIN facility_type ft ON
    f.FACILITY_TYPE_ID = ft.FACILITY_TYPE_ID
    AND ft.PARENT_TYPE_ID = "PHYSICAL_STORE"
WHERE
    os.STATUS_DATETIME <= "2024-12-01 00:00:00.000"
    AND os.STATUS_DATETIME >= "2024-11-01 00:00:00.000"
GROUP BY
    f.FACILITY_ID;


```
| Type   | Cost     | Rows  |
|--------|----------|-------|
| select | 23110.61 | 1148  |

