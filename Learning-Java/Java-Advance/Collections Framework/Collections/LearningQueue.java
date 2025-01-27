import java.util.LinkedList;
import java.util.Queue;

public class LearningQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(7);
        queue.add(9);
        queue.add(11);
        queue.add(13);

        queue.peek();
        System.out.println(queue.peek());
        System.out.println(queue.element());

    }
}