# 2. List All Active Physical Products

## Business Problem:
Merchandising teams often need a list of all **physical products** to manage logistics, warehousing, and shipping.

## Fields to Retrieve:
- `PRODUCT_ID`  
- `PRODUCT_TYPE_ID`  
- `INTERNAL_NAME`  

## SQL Solution:
```sql
SELECT
    p.PRODUCT_ID,
    p.INTERNAL_NAME,
    pt.PRODUCT_TYPE_ID,
    pt.IS_PHYSICAL
FROM
    PRODUCT p
JOIN 
    PRODUCT_TYPE pt ON p.PRODUCT_TYPE_ID = pt.PRODUCT_TYPE_ID
    AND pt.IS_PHYSICAL = 'Y';
```
## Execution Plan
| Type   | nodeName | Cost | Rows |
|--------|----------|------|------|
| select | [NULL]   | 8.16 | 38   |

