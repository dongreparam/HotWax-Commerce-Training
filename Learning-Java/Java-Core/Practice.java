class Practice {

    String color;
    int age;

    void initObj(String color, int age){

        System.out.println(color + " " + age);
    }

    public static void main(String[] args) {
        Practice param = new Practice();

        param.initObj("ponga", 22);
        param.color = "Black";
        param.age = 18;

    }
}