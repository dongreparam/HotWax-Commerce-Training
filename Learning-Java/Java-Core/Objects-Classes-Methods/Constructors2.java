class Employee{
    String n;
    int a;
    Employee(String name,int age){
        n = name;
        a = age;
        System.out.println(n + " " + a);
    }


    public static void main(String[] args) {
        Employee obj = new Employee("Param", 21);
        Employee obj2 = new Employee("Parnika", 22);
    }
}