class Engine {
    String EngineName;
    int version;

    void running(){
        System.out.println("Engine is Running");
    }
}
class Car extends Engine{
    public static void main(String[] args) {
        Car nano = new Car();
        nano.EngineName = "Car Engine";
        nano.version = 5;

        Bike shine = new Bike();
        shine.EngineName = "Bike Engine";
        shine.version = 10;

        System.out.println("Bike Properties " + shine.EngineName + " " + shine.version);
        System.out.println("Car Properties " + nano.EngineName + " " + nano.version);

    }
}

class Bike extends Engine{
}