
import java.util.*;


public class InterLeave {
    public static void interLeave(Queue<Integer>q){
        Queue<Integer>firstHalf=new LinkedList<>();
        int size=q.size();
        int n=size/2;
        for(int i=0;i<n;i++){
           int el= q.remove();
           firstHalf.add(el);
        }
        while(!firstHalf.isEmpty()){
            int el=firstHalf.remove();
            q.add(el);
            int nel=q.remove();
            q.add(nel);
        }


    }
    
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interLeave(q);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }

    
      
     
}
