class Parent {
    void greet(){
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent{
    @Override
    void greet(){
        System.out.println("Hello from Child");
    }

    public static void main(String []args){
        Child c = new Child();
        Parent p = new Child();
        Parent pp = new Parent();
	
	pp.greet();
        c.greet();
        p.greet();
    }
}
