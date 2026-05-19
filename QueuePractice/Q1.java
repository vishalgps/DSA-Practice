
import com.sun.java.accessibility.util.TopLevelWindowListener;
import java.awt.Font;
import java.nio.file.FileStore;
import java.util.*;
import java.util.logging.Handler;
import javax.naming.RefAddr;
import javax.print.attribute.standard.Sides;
import javax.xml.transform.Source;


// public class Q1{
//     public static class Queue{
//        static int arr[];
//         static int rear;
//        static int size;
//         public Queue(int n){
//             arr=new int[n];
//             size=n;
//             rear=-1;
//         }
//         public static boolean isEmpty(){
//             return rear==-1;

//         }

//         public static boolean isFull(){
//             return rear==size-1;
//         }

//         public static void add(int data){
//             if(isFull()){
//                 return;
//             }
//             rear=rear+1;
//             arr[rear]=data;
//         }

//         public static int remove(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int val=arr[0];
//             for(int i=0;i<rear;i++){
//                 arr[i]=arr[i+1];
//             }
//             rear=rear-1;
//             return val;

//         }

//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return arr[0];
//         }


//     }
//     public static void main(String []args){
//         Queue q=new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         while(!q.isEmpty()){
//             System.out.print(q.peek()+" ");
//             q.remove();
//         }

//     }
// }


/// circular queue using Array


// public class Q1{
//     public static class Queue{
//         static int arr[];
//         static int size;
//         static int rear;
//         static int front;

//         public Queue(int n){
//             arr=new int[n];
//             size=n;
//             rear=-1;
//             front=-1;
//         }


//         public static boolean isEmpty(){
//             return rear==-1&&front==-1;
//         }

//         public static boolean  isFull(){
//             return rear==size-1&&front==size-1;
//         }
//         public static  void add(int data){
//             if(isFull()){
//                 return;
//             }
//             if(front==-1){
//                 front=front+1;
//             }
//             rear=(rear+1)%size;
//             arr[rear]=data;
//         }

//         public static int remove(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int val=arr[front];
//             if(rear==front){
//                 rear=front=-1;
//             }else{
//                 front=(front+1)%size;
//             }
//             return val;
//         }

//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return arr[front];
//         }

//     }
//     public static void main(String[] args) {
//         Queue q=new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
        
//     }
// }

// Create queue using linkedlist


// public class Q1{
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static class Queue{
//         static  Node head=null;
//          static Node tail=null;
//         static boolean isEmpty(){
//             return head==null&&tail==null;
//         }

//         public static void add(int data){
//             Node newNode =new Node(data);
//             if(head==null){
//                 head=tail=newNode;
//                 tail.next=head;
//                 return;
//             }
//             tail.next=newNode;
//             tail=newNode;
//             tail.next=head;
//         }
//         public static int remove(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int val=head.data;
//             if(tail==head){
//                 tail=head=null;
//             }else{
//             head=head.next;
//             tail.next=head;
//             }
//             return val;
//         }
//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int val=head.data;
//             return val;
//         }
    

//         }
//     public static void main(String[] args) {
//         Queue q=new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
        
//     }
// }


   // public class Q1{
   //    public static class Queue{
   //       static Stack<Integer>s1=new Stack<>();
   //       static Stack<Integer>s2=new Stack<>();
   //       public static boolean isEmpty(){
   //          return s1.isEmpty();
   //       }
   //       public static void add(int data){
   //          while(!s1.isEmpty()){
   //             int val=s1.pop();
   //             s2.push(val);
   //          }
   //          s1.push(data);
   //          while(!s2.isEmpty()){
   //             int val=s2.pop();
   //             s1.push(val);
   //          }
   //       }
   //       public static int remove(){
   //          if(isEmpty()){
   //             return -1;
   //          }
   //          int val=s1.pop();
   //          return val;
   //       }
   //       public static int peek(){
   //          if(isEmpty()){
   //             return -1;

   //          }
   //          int val=s1.peek();
   //          return val;
   //       }

   //    }
   //    public static void main(String[] args) {
   //       Queue q=new Queue();
   //       q.add(1);
   //       q.add(2);
   //       q.add(3);
   //       q.add(4);
   //       q.add(5);
   //       while(!q.isEmpty()){
   //          System.out.println(q.peek());
   //          q.remove();
   //       }
   //    }
   // }


// create stack using two queue


   // public class Q1{
   //    public static class Stack{
   //       static Queue<Integer>q1=new LinkedList<>();
   //       static Queue<Integer>q2=new LinkedList<>();
   //       public static boolean isEmpty(){
   //          return q1.isEmpty()&&q2.isEmpty();
   //       }
   //       public static void push(int data){
   //          while(!q1.isEmpty()){
   //             int val=q1.remove();
   //             q2.add(val);
   //          }
   //          q1.add(data);
   //          while(!q2.isEmpty()){
   //             int val=q2.remove();
   //             q1.add(val);
   //          }
   //       }

   //       public static int pop(){
   //          if(isEmpty()){
   //             return -1;
   //          }
   //          int val=q1.peek();
   //          q1.remove();
   //          return val;
   //       }

   //       public static int peek(){
   //          if(isEmpty()){
   //             return -1;
   //          }
   //          int  val=q1.peek();
   //          return val;
   
   //       }

   //    }
   //    public static void main(String[] args) {
   //       Stack s=new Stack();
   //       s.push(1);
   //       s.push(2);
   //       s.push(3);

   //       s.push(4);
   //       s.push(5);
   //       while(!s.isEmpty()){
   //          System.out.println(s.peek());
   //          s.pop();
   //       }
   //    }

   // }


   // non reapeating element

   // public class Q1{
   //    public static void nonReapting(String str){
   //       Queue<Character>q=new LinkedList<>();
   //       int map[]=new int[26];
   //       for(int i=0;i<str.length();i++){
   //          char ch=str.charAt(i);
   //          q.add(ch);
   //          map[ch-'a']++;
   //          while(!q.isEmpty()&&map[q.peek()-'a']>1){
   //             q.remove();
   //          }
   //          if(q.isEmpty()){
   //             System.out.print(-1+" ");
   //          }else{
   //             System.out.print(q.peek()+" ");
   //          }
   //       }
   //    }
   //    public static void main(String[] args) {
   //        String str="aabccxb";
   //         nonReapting(str);
   //    }
   // }


   // interleave #####################

   // public class Q1{
   //    public static void interleave(Queue<Integer>q){
   //       Queue<Integer>firstHalfQ=new LinkedList<>();
   //       int size=q.size()/2;
   //       for(int i=0;i<size;i++){
   //          int el=q.remove();
   //          firstHalfQ.add(el);
   //       }

   //       while(!firstHalfQ.isEmpty()){
   //          int el=firstHalfQ.remove();
   //          q.add(el);
   //          int val=q.remove();
   //          q.add(val);
   //       }
   //    }
   //    public static void main(String[] args) {
   //        int arr[]={1,2,3,4,5,6,7,8,9,10};
   //        Queue<Integer>q=new LinkedList<>();
   //        for(int i=0;i<arr.length;i++){
   //          q.add(arr[i]);
   //        }
   //        interleave(q);
   //        while(!q.isEmpty()){
   //          System.out.print(q.peek()+" ");
   //          q.remove();
   //        }
   //    }
   // }


   // Queue revwrsal // using stack#################


   // public class Q1{
   //    public static void queueReversal(Queue<Integer>q){
   //       Stack<Integer>s=new Stack<>();
   //       int size=q.size();
   //       for(int i=0;i<size;i++){
           
   //                  int el= q.remove();

   //          s.push(el);
   //       }
   //       while(!s.isEmpty()){
   //          int el=s.pop();
   //          q.add(el);
            
   //       }
   //    }
   //    public static void main(String[] args) {
   //        int arr[]={1,2,3,4,5};
   //        Queue<Integer>q=new LinkedList<>();
   //        for(int i=0;i<arr.length;i++){
   //          q.add(arr[i]);
   //        }

   //        queueReversal(q);
   //        while(!q.isEmpty()){
   //          System.out.println(q.peek());
   //          q.remove();
   //        }

   //    }
   // }

   
   
   public class Q1{
      public static class Node {
         int data;
         Node next;
         public Node(int data){
            this.data=data;
            this.next=null;
         }
      }
      public static class Queue{
         static Node head=null;
         static Node tail=null;
         public static boolean  isEmpty(){
            return head==null&&tail==null;
         }
         public static void add(int data){
            Node newNode =new Node(data);
            if(isEmpty()){
               head=tail=newNode;
               return;
            }
            tail.next=newNode;
            tail=newNode;
            tail.next=head;
         }
         public static int remove(){
            if(isEmpty()){
               return -1;
            }
            int val=head.data;
            if(tail==head){
               tail=head=null;
            }else
            {
            head=head.next;
            tail.next=head;
            }
            return val;
         }
         public static int peek(){
            if(isEmpty()){
               return -1;
            }
            int val=head.data;
            return val;
         }
      
      }
      public static void main(String[] args) {
         Queue q=new Queue();
         q.add(1);
         q.add(2);
         q.add(3);
         q.add(4);
         q.add(5);
         while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
         }
          
      }
   }