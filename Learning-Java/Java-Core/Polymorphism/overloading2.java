class Test2{
    void show(int a){
        System.out.println("Int Method");
    }

    void show(int... a){
        System.out.println("Float int Method");
    }

    public static void main(String[] args) {
        Test2 t = new Test2();
        t.show(1,2,34,4);
        t.show(1);
    }
}