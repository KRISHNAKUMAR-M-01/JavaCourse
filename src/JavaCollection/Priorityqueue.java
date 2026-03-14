package JavaCollection;
import java.util.PriorityQueue;
import java.util.Collections;

public class Priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.add(20);
        pq.offer(15);
        pq.add(16);
        System.out.println(pq);
        System.out.println(pq.peek());
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
        System.out.println(pq.peek());
    }
}
