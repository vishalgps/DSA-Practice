
import java.util.Stack;


// import java.util.*;
// public class Stfirst{
//     public static class stack{
//        static ArrayList<Integer>list=new ArrayList<>();
//        public static boolean isEmpty(){
//         return list.size()==0;
//        }
//        // add

//        public static void push(int data){
//         list.add(data);
//        }
//        public static int pop(){
     
//         if(isEmpty()){
//             return -1;
//         }
//         int el=list.get(list.size()-1);
//         list.remove(list.size()-1);
//         return el;
//        }

//        public static int peek(){
//         int el=list.get(list.size()-1);
//         return el;
//        }

//     }
//     public static void main(String[] args){
//         stack s=new stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while(!s.isEmpty()){
//             System.out.print(s.peek()+" ");
//             s.pop();
//         }

//     }
// }


//create the stack through the linkedList

// public class Stfirst{
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }

//     public static class Stack{
//         static Node head=null;
//         public static boolean isEmpty(){
//            return head==null;
//         }
//         public static void push(int data){
//           Node newNode=new Node(data);
//           if(isEmpty()){
//             head=newNode;
//             return;
//            }
//          newNode.next=head;
//          head=newNode;
//        }

//        public static int pop(){
//         if(isEmpty()){
//             return -1;
//         }
//         int el=head.data;
//         head=head.next;
//         return el;
        
//        }

//        public static int peek(){
       
//         if(isEmpty()){
//             return -1;
//         }

//         return head.data;
//        }

//     }
//     public static void main(String[] args) {
//         Stack s=new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         while(!s.isEmpty()){
//             System.out.print(s.peek()+" ");
//             s.pop();
//         }
        
//     }
// }



// push at bottom

// public class Stfirst{
//     public static void pushAtBottom(Stack<Integer>s,int data){
//         if(s.isEmpty()){
//             s.push(data);
//             return;
//         }
//        int top= s.pop();
//         pushAtBottom(s, data);
//         s.push(top);

//     }
//     public static void main(String[] args) {
//         Stack<Integer>s=new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         pushAtBottom(s, 4);

//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }

//     }
// }


// public class Stfirst{
//     public static String reverseString(String str){
//         Stack<Character>s=new Stack<>();
//         int i=0;
//         while(i<str.length()){
//             s.push(str.charAt(i));
//             i++;
//         }

//         StringBuilder ans=new StringBuilder();

//         while(!s.isEmpty()){
//                 char ch=s.pop();
//                 ans.append(ch);

//         }
//         return ans.toString();
//     }
//     public static void main(String[] args) {
//         String str="abc";
//         System.out.print(reverseString(str));

//     }
// }

public class Stfirst{
    public static void pushAtBottom(Stack<Integer>s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    public static void printStack(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverseStack(s);
        printStack(s);

    }
}