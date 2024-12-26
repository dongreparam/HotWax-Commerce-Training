class A {
    void showA(){
        System.out.println("A class Method");
    }
}
class B extends A{
    void showB(){
        System.out.println("B class Method");
    }
}
class C extends B{
    void showC(){
        System.out.println("C class Method");
    }

    public static void main(String[] args) {
        A obj1 = new A();
        obj1.showA();

        B obj2 = new B();
        obj2.showB();
        obj2.showA();

        C obj3 = new C();
        obj3.showC();
        obj3.showB();
        obj3.showA();
    }
}