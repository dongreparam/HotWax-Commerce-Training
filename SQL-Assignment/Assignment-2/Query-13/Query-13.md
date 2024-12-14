## Fetch the following details for orders completed in August of 2023.

---

### Query to Fetch the Required Details:
```sql
select
  oi.PRODUCT_ID ,
  p.PRODUCT_TYPE_ID ,
  oi.QUANTITY,
  oi.CANCEL_QUANTITY,
  p.INTERNAL_NAME,
  f.FACILITY_TYPE_ID,
  oh.ORDER_HISTORY_ID,
  oh.ORDER_ID,
  oi.ORDER_ITEM_SEQ_ID,
  oi.SHIP_GROUP_SEQ_ID,
  oi.EXTERNAL_ID
from
	order_item oi
join order_status os on
	oi.ORDER_ID = os.ORDER_ID
	and os.STATUS_ID = "ORDER_COMPLETED"
	and os.STATUS_DATETIME > "2023-08-01 00:00:00.000"
	and os.STATUS_DATETIME < "2023-08-31 00:00:00.000"
join product p on
	oi.PRODUCT_ID = p.PRODUCT_ID
join order_item_ship_group oisg on
	oi.ORDER_ID = oisg.ORDER_ID
	and oi.SHIP_GROUP_SEQ_ID = oisg.SHIP_GROUP_SEQ_ID
join facility f on
	oisg.FACILITY_ID = f.FACILITY_ID
join order_history oh on
	oi.ORDER_ID = oh.ORDER_ID
	and oi.ORDER_ITEM_SEQ_ID = oh.ORDER_ITEM_SEQ_ID
	and oi.SHIP_GROUP_SEQ_ID = oh.SHIP_GROUP_SEQ_ID 
;
