# SQL Query Documentation

## Query Overview
This SQL query retrieves all orders that have more than one return. It counts both the number of returns (`RETURN_ID`) and the number of return items (`RETURN_ITEM_SEQ_ID`) for each order and filters the results to include only those orders with more than one return.

## SQL Query

```sql
select ri.ORDER_ID, 
       count(ri.RETURN_ID) as Return_Count, 
       count(ri.RETURN_ITEM_SEQ_ID) as Return_Item_Count
from return_item ri
where ri.ORDER_ID is not null
group by ri.ORDER_ID
having count(ri.RETURN_ID) > 1;
```

| Type   |  Cost   | Rows |
|--------|---------|------|
| select |  206.35 | 1002 |
