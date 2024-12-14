## QUESTION 2:  
**Fetch the following columns for completed return items of SM_STORE for ecom return channel.**

**Columns to Fetch:**
- RETURN_ID
- ORDER_ID
- PRODUCT_STORE_ID
- STATUS_DATETIME
- ORDER_NAME
- FROM_PARTY_ID
- RETURN_DATE
- ENTRY_DATE
- RETURN_CHANNEL_ENUM_ID

### Query:
```sql
SELECT
    rh.RETURN_ID,
    ri.RETURN_ITEM_SEQ_ID,
    rh.RETURN_CHANNEL_ENUM_ID,
    rh.FROM_PARTY_ID,
    rh.ENTRY_DATE,
    rh.RETURN_DATE,
    oh.ORDER_ID,
    oh.PRODUCT_STORE_ID,
    oh.ORDER_NAME,
    rs.STATUS_DATETIME
FROM
    return_header rh
JOIN return_item ri ON
    rh.RETURN_ID = ri.RETURN_ID
JOIN return_status rs ON
    ri.RETURN_ID = rs.RETURN_ID
JOIN order_header oh ON
    ri.ORDER_ID = oh.ORDER_ID
WHERE
    rs.STATUS_ID = 'RETURN_COMPLETED'
    AND oh.PRODUCT_STORE_ID = 'SM_STORE'
    AND rh.RETURN_CHANNEL_ENUM_ID = 'ECOM_RTN_CHANNEL';

```


| Type   |  Cost   | Rows |
|--------|---------|------|
| select |  900.72 | 3524 |

