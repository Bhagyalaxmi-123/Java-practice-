import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(100);
        queue.add(200);
        queue.add(300);

        System.out.println("Queue: " + queue);

        int removed = queue.remove();
        System.out.println("Removed: " + removed);
        System.out.println("Queue after remove: " + queue);

    }
}