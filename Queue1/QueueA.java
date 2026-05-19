
import java.util.*;


// public class QueueA {       /// tc o(n);

//     public static class Queue{
//         static int arr[];
//         static int size;
//         static int rear;
//         public Queue(int n) {
//             arr=new int[n];
//             size=n;
//             rear=-1;
//         }
        
//         public static boolean isEmpty(){
//             return rear==-1;
//         }

//         public static void add(int data){
//             if(rear==size-1){
//                  System.out.println("queue is full");
//                 return;
//             }
//              rear=rear+1;
//              arr[rear]=data;
//         }

//         public static int remove(){
//             if(isEmpty()){
//                 return -1;
//             }

//             int front=arr[0];
//             for(int i=0;i<rear;i++){
//                 arr[i]=arr[i+1];
//             }
//             rear=rear-1;

//              return front;
//         }

//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return arr[0];
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



// circular queue

// public class QueueA{
//     public static class Queue{

//         static int arr[];
//         static int size;
//         static int rear;
//         static int front;

//         public Queue(int n) {
//             arr=new int[n];
//             size=n;
//             rear=-1;
//             front=-1;
//         }

//         public static boolean isEmpty(){
//             return rear==-1&&front==-1; 

//         }

//         public static boolean isFull(){
//             return (rear+1)%size==front;

//         }

//         public static void add(int data){
//             if(isFull()){
//                 return;
//             }

//             if(front==-1){
//                 front=0;
//             }
//             rear=(rear+1)%size;
//             arr[rear]=data;

//         }
        
//         public static int remove(){
//             if(isEmpty()){
//                 return -1;
//             }

//             int res=arr[front];
//             front=(front+1)%size;
//             // last el delete
//             if(rear==front){
//                 front=-1;
//                 rear=-1;
//             }else{
//                 front=(front+1)%size;
//             }
//             return front;

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



// create queue using linked list  

// tc o(n);


// public class QueueA{
//     public static class Node {
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }

//     public static class Queue{
//         static Node head=null;
//         static Node tail=null;
//          public static boolean isEmpty(){
//         return head==null&&tail==null;
//       }

//       public static void add(int data){
//         Node newNode=new Node(data);
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;
//       }

//       public static int remove(){
//         if(isEmpty()){
//             return -1;
//         }
//         int val=head.data;
//         if(tail==head){
//             head=null;
//             tail=null;
//         }else{
//             head=head.next;
//         }
//         return val;

//       }

//       public static int peek(){
//         if(isEmpty()){
//             return -1;
//         }
//         return head.data;

//       }
        
//     }

   
//     public static void main(String[] args){
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


// using java colletion frame work

public class QueueA{

    
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
}



