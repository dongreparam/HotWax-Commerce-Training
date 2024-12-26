class Test3 {
    void show(){
        System.out.print("Hello 1");
    }
}
class Xyz extends Test3{
    void show(){
        super.show();
        System.out.println("Hello 2");
    }

    public static void main(String[] args) {
        Xyz obj = new Xyz();
        obj.show();
    }
}