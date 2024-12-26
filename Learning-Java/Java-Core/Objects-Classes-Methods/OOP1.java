class Animal{
    public void eat(){
        System.out.println("I am Eating");
    }
    public void run(){
        System.out.println("I am Running");
    }

    public static void main(String[] args) {
        Animal tommy = new Animal();
        tommy.eat();
        tommy.run();
    }
}