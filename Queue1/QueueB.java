
// create queue using two stack

// public class QueueB {
//     public static class Queue{
//         static Stack<Integer>s1=new Stack<>();
//         static Stack<Integer>s2=new Stack<>();

//         public static boolean isEmpty(){
//             return s1.isEmpty()&&s2.isEmpty();
//         }

//         public static void add(int data){
//             while(!s1.isEmpty()){
//                 int el=s1.pop();
//                 s2.push(el);
//             }
//             s1.push(data);

//             while(!s2.isEmpty()){
//                 int el=s2.pop();
//                 s1.push(el);
//             }


//         }

//         public static int remove(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return s1.pop();

//         }

//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return s1.peek();
//         }

//     }
//     public static void main(String[] args) {

//         Queue q=new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);

//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }


        
        
//     }
    
// }



//create stack using two queue


// import java.util.*;
// public class QueueB{
//     public static class Stack{
//         static Queue<Integer>q1=new LinkedList<>();
//         static Queue<Integer>q2=new LinkedList<>();
//         public static boolean isEmpty(){
//             return q1.isEmpty()&&q2.isEmpty();
//         }
//         public static void push(int data){
//             if(!q1.isEmpty()){
//                 q1.add(data);
//             }else{
//                 q2.add(data);
//             }
//         }

//         public static int pop(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int top=-1;
//             if(!q1.isEmpty()){
//                while(!q1.isEmpty()){
//                    int el=q1.remove();
//                    top=el;
//                    if(q1.isEmpty()){
//                       break;
//                     }
//                     q2.add(top);

//                 }
//             }else{
//                 while(!q2.isEmpty()){
//                     int el=q2.remove();
//                     top=el;
//                     if(q2.isEmpty()){
//                         break;
//                     }
//                     q1.add(top);
//                 }

//          }
           
//      return top;
  
//     }

//     public static int peek(){
//         if(isEmpty()){
//             return -1;
//         }

//         int top=-1;
//         if(!q1.isEmpty()){
//             while(!q1.isEmpty()){
//                 int el=q1.remove();
//                 top=el;


//                 q2.add(top);

//             }
//         }else{
//             while(!q2.isEmpty()){
//                 int el=q2.remove();
//                 top=el;
//                 q1.add(top);
//             }
//         }
//         return top;
//     }

   
// }
//     public static void main(String[] args) {

//         Stack s=new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         s.push(5); 

//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();

//         }

        
//     }

// }