import java.util.*;

// public class dque {
//     public static void main(String[] args) {
//         Deque<Integer>deque=new LinkedList<>();
//         deque.addFirst(1);
//         deque.addFirst(2);
//         System.out.println(deque);
//         deque.removeFirst();
//         System.out.println(deque);
//     }
    
// }



// create stack using deque

// public class dque{
//     public static class Stack{
//        static Deque<Integer>deque=new LinkedList<>();
    
//         public static void push(int data){
//             deque.addLast(data);

//         }

//         public static int pop(){
//             return deque.removeLast();

//         }
//         public static int peek(){
//             return deque.getLast();
//         }

//     }
//     public static void main(String[] args) {
//         Stack s =new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
        
//         System.out.println("peek="+ s.peek());
//         System.out.println(s.pop());
//         System.out.println(s.pop());
//         System.out.println(s.pop());
//         System.out.println(s.pop());


          

//     }
// }



public class dque{
    public static class Queue{
        static Deque<Integer>deque=new LinkedList<>();
         public static void add(int data){
            deque.addLast(data);

            
         }
         public static int remove(){
            return deque.removeFirst();

         }
         public static int peek(){
            return deque.getFirst();
         }


    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q.peek());
        

        
    }
}
