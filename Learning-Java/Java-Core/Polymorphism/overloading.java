class Test {
    void show(){
        System.out.println("Show1");
    }

    void show(int a){
        System.out.println("Show2");
    }

    public static void main(String[] args) {
        Test obj1 = new Test();
        obj1.show();
        obj1.show(1);
    }
}