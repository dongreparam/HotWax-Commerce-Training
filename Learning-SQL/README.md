# 🔧 Learning SQL with Abstract Syntax Trees (AST) in Java

This mini-project demonstrates how to build SQL queries using an **Abstract Syntax Tree (AST)** structure in Java. Inspired by how compilers and ORMs (like JOOQ or Hibernate) parse and render SQL, this exercise helps understand how query components can be modeled as objects and compiled into executable SQL strings.

---

## 📌 Project Overview

The project contains three core Java classes:

| Class       | Purpose                                      |
|-------------|----------------------------------------------|
| `Field`     | Represents a column in the SQL `SELECT` list |
| `Condition` | Represents a condition in the `WHERE` clause |
| `Query`     | Ties it all together to generate a full SQL query |

A fourth class `QueryTest` demonstrates usage and outputs a final SQL query from the AST structure.

---

## 📄 Sample Output

```sql
SELECT name, email FROM user WHERE id = 1;

