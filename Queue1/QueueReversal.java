
import java.util.*;
public class QueueReversal {
    public static void reversalQueue(Queue<Integer>q){
        Stack<Integer>s=new Stack<>();
        while(!q.isEmpty()){
           int el= q.remove();
           s.push(el);
        }

        while(!s.isEmpty()){
            int el=s.pop();
            q.add(el);
        }
    
    }
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);



        reversalQueue(q);
        
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

        
    }
    
}
