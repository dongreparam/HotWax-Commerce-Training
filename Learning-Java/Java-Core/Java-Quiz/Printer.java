class Printer {
    String message;
    int num;
    void print(String message){
        this.message = message;
        System.out.println(message);
    }
    void print(int num){
        this.num = num;
        System.out.println("The number is :" + num);
    }

    public static void main(String []args){
        Printer p = new Printer();
        p.print("Hello");
        p.print(2);
    }
}