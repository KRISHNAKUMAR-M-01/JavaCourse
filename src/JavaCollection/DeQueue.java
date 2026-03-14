package JavaCollection;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Iterator;


public class DeQueue {
    public static void main(String[] args) {
        Deque<Integer> dq=new ArrayDeque<>();
        dq.offer(8);
        dq.offer(10);
        dq.offerLast(20);
//        System.out.println(dq);
//        dq.pollLast();
//        System.out.println(dq);
//        System.out.println(dq.peek());
//        dq.pollFirst();
//        dq.pollFirst();
//        System.out.println(dq);
//        dq.push(50);
//        dq.push(60);
//        dq.push(70);
//        System.out.println(dq.pop());
        Iterator iterator =dq.descendingIterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

    }
}
