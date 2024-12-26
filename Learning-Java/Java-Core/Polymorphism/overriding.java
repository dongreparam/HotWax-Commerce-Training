class Test {
    void show(){
        System.out.println("1");
    }
}

class Xyz extends Test {
    void show(){
        System.out.println("2");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.show();

        Xyz t2 = new Xyz();
        t2.show();
    }
}