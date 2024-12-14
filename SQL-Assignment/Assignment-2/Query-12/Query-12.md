## Question 12 - Get all the appeasements in July month.

---

### Query to Identify Appeasements:
```sql
SELECT DISTINCT 
    RETURN_ITEM_SEQ_ID
FROM 
    return_adjustment ra
WHERE 
    RETURN_ADJUSTMENT_TYPE_ID = 'APPEASEMENT';

```

### Part 2 -

```sql
SELECT 
    rh.RETURN_ID, 
    oh.ORDER_ID, 
    rh.ENTRY_DATE, 
    oh.ORDER_DATE, 
    ra.RETURN_ADJUSTMENT_TYPE_ID, 
    ra.AMOUNT, 
    oh.PRODUCT_STORE_ID, 
    ra.COMMENTS, 
    rh.RETURN_DATE
FROM 
    order_header oh
JOIN 
    return_adjustment ra ON oh.ORDER_ID = ra.ORDER_ID
JOIN 
    return_header rh ON ra.RETURN_ID = rh.RETURN_ID
WHERE 
    ra.RETURN_ADJUSTMENT_TYPE_ID = 'APPEASEMENT'
    AND MONTH(rh.RETURN_DATE) = 7;
```

| Type   |  Cost   | Rows |
|--------|---------|------|
| select |  307.65 | 365  |
