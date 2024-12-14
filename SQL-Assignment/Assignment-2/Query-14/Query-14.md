# SQL Query Documentation

## Query Overview
This SQL query retrieves the `PRODUCT_ID` and `VARIANCE_REASON_ID` for inventory items that have a variance reason of either 'VAR_LOST' or 'VAR_DAMAGED'.

## SQL Query

```sql
select ii.PRODUCT_ID, iiv.VARIANCE_REASON_ID
from inventory_item ii
join inventory_item_variance iiv on ii.INVENTORY_ITEM_ID = iiv.INVENTORY_ITEM_ID
where iiv.VARIANCE_REASON_ID = 'VAR_LOST' or iiv.VARIANCE_REASON_ID = 'VAR_DAMAGED';
```

| Type   | Cost     | Rows   |
|--------|----------|--------|
| select |173423.83 | 304327 |
