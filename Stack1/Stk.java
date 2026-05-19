
// import java.util.ArrayList;

// public class Stk {
//     public static class Stack{
//         static ArrayList<Integer>list=new ArrayList<>();

//         public static boolean isEmpty(){
//             return list.size()==0;
//         }

//         public static void push(int data){
//             list.add(data);
//         }

//         public static int pop(){

//             if(isEmpty()){
//                 return -1;
//             }
//             int el=list.get(list.size()-1);
//             list.remove(list.size()-1);
//             return el;
//         }

//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int el=list.get(list.size()-1);
//             return el;
//         }
//     }
//     public static void main(String[] args){
//          Stack s=new Stack();
//          s.push(1);
//          s.push(2);
//          s.push(3);

//          while(!s.isEmpty()){
//             System.out.print(s.peek()+" ");
//             s.pop();
//          }

//     }
    
// }


public class Stk{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }

        
    }

    public static class Stack{
        static Node head=null;;
        public static boolean isEmpty(){
            return head==null;

        }

        public static void push(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        public static int pop(){
           if(isEmpty()){
            return -1;
           }
            int el=head.data;
            head=head.next;
            return el;

        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int el=head.data;
            return el;
        }
    }
    public static void main(String[] args){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }

    }
}
