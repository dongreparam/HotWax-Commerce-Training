package ExceptionHandling;
class Testing{

    public static void main(String[] args) {

        System.out.println("1");
        try {
            System.out.println("2");
            int a=100,b=2,c;
            System.out.println("3");
            c = a/b;
            System.out.println("4");
            System.out.println(c);
            System.out.println("5");
        }
        catch (Exception e){
            System.out.println("6");
            System.out.println(e);
            System.out.println("7");
        }
    }
}