## QUESTION:  
**Fetch the order ID and contact mech ID for the shipping address of the orders completed in October of 2023.**

### Query:
```sql
SELECT
    oh.ORDER_ID,
    ocm.CONTACT_MECH_ID,
    ocm.CONTACT_MECH_PURPOSE_TYPE_ID,
    oh.STATUS_ID
FROM
    order_header oh
JOIN order_contact_mech ocm ON
    oh.ORDER_ID = ocm.ORDER_ID
    AND ocm.CONTACT_MECH_PURPOSE_TYPE_ID = 'SHIPPING_LOCATION'
JOIN order_status os ON
    oh.ORDER_ID = os.ORDER_ID
    AND os.STATUS_ID = 'ORDER_COMPLETED'
WHERE
    os.STATUS_DATETIME > '2023-09-30 23:59:59.999'
    AND os.STATUS_DATETIME < '2023-11-01 00:00:00.000';


```

| Type   | Cost     | Rows  |
|--------|----------|-------|
| select | 19531.42 | 50254 |
