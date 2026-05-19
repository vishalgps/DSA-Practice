import java.util.*;

public class Pdeque {
    public static void main(String[] args) {
        Deque<Integer>d=new LinkedList<>();
        d.addLast(2);
        d.addFirst(1);
        d.addLast(3);
        d.addLast(4);
        d.addLast(5);
        // while(!d.isEmpty()){
        //     System.out.println(d.peek());
        //     d.remove();
        // }

        // System.out.println(d.removeFirst());
        // System.out.println(d.removeLast());
        System.out.println(d.getFirst());
        System.out.println(d.getLast());
        
    }
    
}
