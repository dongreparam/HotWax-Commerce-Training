interface Goat {
    default void doesItRun() {
        System.out.println("Hello from interface");
    }
}

public class interfaces implements Goat {

    // Overriding the default method
    @Override
    public void doesItRun() {
        System.out.println("I want to override this and make it run");
    }

    public static void main(String[] args) {
        System.out.println("Hello from class");

        interfaces obj = new interfaces(); // creating object
        obj.doesItRun(); // calls the overridden version
    }
}
