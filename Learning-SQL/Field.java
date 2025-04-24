import java.util.ArrayList;
import java.util.List;

public class Field {
    String name;

    public Field(String name){
        this.name = name;
    }
}

class Condition{
    String field;
    String operator;
    String value;

    public Condition(String field, String operator, String value){
        this.field = field;
        this.operator = operator;
        this.value = value;
    }
    public String toSQL(){
        String finalQuery = field + " " + operator + " " + value;
        return finalQuery;
    }
}

class Query{
    String entity;
    List<Field> fieldsList = new ArrayList<>();
    Condition where;

    Query(String entity, List<Field> fieldsList, Condition where){
        this.entity = entity;
        this.where = where;
        this.fieldsList = fieldsList;
    }

    String toSQL(){


        StringBuilder st = new StringBuilder("SELECT ");

        for (int i = 0; i < fieldsList.size(); i++){
            st.append(fieldsList.get(i).name);
            if (i< fieldsList.size() -1){
                st.append(", ");

            }
        }

        st.append(" FROM ").append(entity);

        if (where != null){
            st.append(" WHERE ").append(where.toSQL());
        }
        return st.toString();
    }

}
class QueryTest{
    public static void main(String[] args) {
        Field field1 = new Field("name");
        Field field2 = new Field("email");

        List<Field> fields = new ArrayList<>();
        fields.add(field1);
        fields.add(field2);

        Condition cond = new Condition("id","=","1");

        Query query = new Query("user", fields, cond);
        String q = query.toSQL();

        System.out.println(q);
    }
}