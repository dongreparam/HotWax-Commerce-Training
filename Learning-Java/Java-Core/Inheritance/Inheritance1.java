class Animal{
    void eat(String name){
        System.out.println(name + " is Eating");
    }
    void run(String namedu){
        System.out.println(namedu + " is Running");
    }
    int age;
    String color;
}

class Dog extends Animal{
    public static void main(String[] args) {
        Dog tommy = new Dog();
        tommy.eat("Tommy");
        tommy.run("Tommy");

        tommy.age = 12;
        tommy.color = "Black";

        System.out.println("Tommy is " + tommy.age + " and " + tommy.color);

    }
}