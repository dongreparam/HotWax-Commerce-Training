interface Calculator {
    int operate(int a, int b);
}

class Operation {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;
        Calculator mul = (a, b) -> a * b;
        Calculator div = (a, b) -> a / b;

        System.out.println("Addition: " + add.operate(5, 6));
        System.out.println("Subtraction: " + sub.operate(6, 5));
        System.out.println("Multiplication: " + mul.operate(6, 5));
        System.out.println("Division: " + div.operate(10, 2));
    }
}
