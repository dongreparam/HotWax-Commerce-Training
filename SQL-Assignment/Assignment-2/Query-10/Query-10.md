# Question 10
## Fetch all the order items that are in the created status and the order type should be a sales order.

---

### Query:
```sql
SELECT
    oh.ORDER_ID,
    oi.ORDER_ITEM_SEQ_ID,
    p.PRODUCT_TYPE_ID,
    oi.EXTERNAL_ID,
    oh.SALES_CHANNEL_ENUM_ID AS SALES_CHANNEL,
    oi.QUANTITY,
    oi.STATUS_ID AS ITEM_STATUS,
    oi.PRODUCT_ID,
    pa.CITY AS Billing_City,
    pa2.CITY AS Shipping_City,
    pa.POSTAL_CODE AS Billing_Code,
    pa2.POSTAL_CODE AS Shipping_Code,
    pa.ADDRESS1 AS Billing_Address1,
    pa.ADDRESS2 AS Billing_Address2,
    pa2.ADDRESS1 AS Shipping_Address1,
    pa2.ADDRESS2 AS Shipping_Address2
FROM
    order_item oi
JOIN
    order_header oh ON oh.ORDER_ID = oi.ORDER_ID
JOIN
    product p ON p.PRODUCT_ID = oi.PRODUCT_ID
JOIN
    order_contact_mech ocm ON oi.ORDER_ID = ocm.ORDER_ID AND ocm.CONTACT_MECH_PURPOSE_TYPE_ID = 'BILLING_LOCATION'
JOIN
    order_contact_mech ocm2 ON oi.ORDER_ID = ocm2.ORDER_ID AND ocm2.CONTACT_MECH_PURPOSE_TYPE_ID = 'SHIPPING_LOCATION'
JOIN
    postal_address pa ON ocm.CONTACT_MECH_ID = pa.CONTACT_MECH_ID
JOIN
    postal_address pa2 ON ocm2.CONTACT_MECH_ID = pa2.CONTACT_MECH_ID
WHERE
    oi.STATUS_ID = 'ITEM_CREATED'
    AND oh.ORDER_TYPE_ID = 'SALES_ORDER';


```

| Type   | Cost     | Rows  |
|--------|----------|-------|
| select | 72062.26 | 79318 |
