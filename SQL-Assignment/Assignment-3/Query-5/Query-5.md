## QUESTION 5:  
**In New York, which product has the highest sales?**

### Query:
```sql
select
	oi.PRODUCT_ID,
	sum(oi.QUANTITY) as Sales
from
	order_item oi
join order_contact_mech ocm on
	oi.ORDER_ID = ocm.ORDER_ID
	and ocm.CONTACT_MECH_PURPOSE_TYPE_ID = "SHIPPING_LOCATION"
join postal_address pa on
	ocm.CONTACT_MECH_ID = pa.CONTACT_MECH_ID
	and pa.CITY = "New York"
group by
	oi.PRODUCT_ID
order by
	Sales desc
;
```

| Type   | Cost     | Rows  |
|--------|----------|-------|
| select | 11041.58 | 10602 |




