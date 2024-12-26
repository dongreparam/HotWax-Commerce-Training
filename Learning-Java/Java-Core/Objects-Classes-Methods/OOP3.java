class Animal3 {
    String color;
    int age;

    void initObj (String c, int a){
        color = c;
        age = a;
    }
    void display(){
        System.out.println(color + " " + age);
    }

    public static void main(String[] args) {
        Animal3 ponky = new Animal3();
        ponky.initObj("brown",5);
        ponky.display();
    }
}