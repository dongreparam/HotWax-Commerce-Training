import java.util.Stack;

public class LearnVectorAndStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.add("Param");
        stack.add("Shriya");
        stack.add("Priyanshee");
        stack.add("Parnika");

        System.out.println(stack);

        stack.add(2, "Vidhan");
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack.empty());
        System.out.println(stack.search("Param"));

        Stack stack1 = new Stack();
        stack1.add("Naya Stack ka object");
        stack1.addAll(stack);
        System.out.println(stack1);




    }
}