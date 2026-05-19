





// import java.util.*;

// // create a stack through arraylist
// public class p1 {
//     public static class Stack{
//        static  List<Integer>list=new ArrayList<>();
//          public static boolean isEmpty(){
//             return list.size()==0;
//         }
       
//         public static void push(int data){
//             list.add(data);

//         }
//         public static int pop(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int temp=list.get(list.size()-1);
//              list.remove(list.size()-1);
//              return temp;

//         }

//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
            
//             return list.get(list.size()-1);
//         }
//     }
    
//     public static void main(String[] args) {
//         Stack s=new Stack();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
//        s.push(5);
//        while(!s.isEmpty()){
//         System.out.println(s.peek());
//          s.pop();

//        }
       


//     }
    
// }

// import java.util.*; // create a stack using linkedlist

// public class p1{
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static class Stack{
//             public static Node head;


//         public static boolean isEmpty(){
//             return head==null;
//         }
//         public static void push(int data){
//             Node newNode=new Node(data);
//             if(isEmpty()){
//                 head=newNode;
//                 return;
//             }
//             newNode.next=head;
//             head=newNode;
//         }

//         public static int pop(){
          
//             if(isEmpty()){
//                 return -1;
//             }
//             int val=head.data;
//             head=head.next;
//             return val;
        
//         }
//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int val=head.data;
//             return val;

//         }
//     }
//     public static void main(String[] args) {
//         Stack s=new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         s.push(5);;
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }

import java.util.*;
import javax.crypto.Mac;

// public class p1{
//     public static void nextgt(int nums[]){
//         Stack<Integer>s=new Stack<>();
//         int n=nums.length;

//         int gt[]=new int[n];
//         for(int i=0;i<n;i++){
//             while(!s.isEmpty()&&nums[s.peek()]>=nums[i]){
//                 s.pop();
//             }
//             if(s.isEmpty()){
//                 gt[i]=-1;
//             }else{
//                 gt[i]=nums[s.peek()];
//             }
//             s.push(i);
//         }
//         for(int i=0;i<gt.length;i++){
//             System.out.print(gt[i]+" ");
//         }
       
//     }
//     public static void main(String[] args) {
//         int nums[]={6,8,0,1,3};
//         nextgt(nums);
     
// }
// }



// public class p1{
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

//         public static void pushAtbottom(int data){
//             if(isEmpty()){
//                 push(data);
//                 return;
//             }
//             int top=pop();
//             pushAtbottom(data);
//             push(top);
//         }

//         public static void reverse(){
//             if(isEmpty()){
//                 return;
//             }
//             int top=pop();
//             reverse();
//             pushAtbottom(top);

//         }

        
//     }
//     public static void main(String[] args){
//         Stack s=new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);

       

//         s.pushAtbottom(4);
//         s.reverse();

//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }

//     }
// }


// public class p1{
//     public static void reverse(String str){
//         Stack<Character>ch=new Stack<>();
//         int i=0;
//         while(i<str.length()){
//             char c=str.charAt(i);
//             ch.push(c);
//            i++;

//         }
//         StringBuilder s=new StringBuilder();
//         while(!ch.isEmpty()){
//             char c=ch.pop();
//             s.append(c);
//         }
//         System.out.println(s.toString());
//     }
//     public static void main(String[] args) {
//         String str="abc";
//         reverse(str);

//     }
// }


// span stock

// public class p1{
//     public static void spanStock(int stock[]){
//         int n=stock.length;
//         int span[]=new int[n];
//         Stack<Integer>s=new Stack<>();
//         s.push(0);
//         span[0]=1;
//         for(int i=1;i<n;i++){
//             int currPrice=stock[i];
//             while(!s.isEmpty()&&stock[s.peek()]<=stock[i]){
//                 s.pop();
//             }
//             if(s.isEmpty()){
//                 span[i]=i+1;
//             }
//             else{
//                 int preH=s.peek();
//                 span[i]=i-preH;
//             }
//             s.push(i);
//         }

//         for(int i=0;i<span.length;i++){
//             System.out.print(span[i]+" ");
//         }

       
//     }
//     public static void main(String[] args){
//         int stock[]={100,80,60,70,60,85,100};
//         spanStock(stock);
//     }
// }



// next greater from right;

// public class p1{
//     public static void nextGtgreater(int nums[]){
//         Stack<Integer>s=new Stack<>();
//         int nextGt[]=new int[nums.length];
//         for(int i=nums.length-1;i>=0;i--){
//             while(!s.isEmpty()&&nums[s.peek()]<=nums[i]){
//                 s.pop();
//             }

//             if(s.isEmpty()){
//                 nextGt[i]=-1;
//             }
//             else{
//                 nextGt[i]=nums[s.peek()];
//             }
//             s.push(i);
//         }

//         for(int i=0;i<nextGt.length;i++){
//             System.out.print(nextGt[i]+" ");
//         }
//     }
//     public static void main(String [] args){
//         int nums[]={6,8,0,1,3};
//         nextGtgreater(nums);
//     }
// }



// next Greater from left


// public class p1{

//     public static void nextGreaterFromleft(int nums[]){
//         Stack<Integer>s=new Stack<>();
//         int nextGt[]=new int[nums.length];
//         for(int i=0;i<nums.length;i++){
//             while(!s.isEmpty()&&nums[s.peek()]<=nums[i]){
//                 s.pop();

//             }
//             if(s.isEmpty()){
//                 nextGt[i]=-1;
//             }
//             else{
//                 nextGt[i]=nums[s.peek()];
//             }
//             s.push(i);
//         }

//         for(int i=0;i<nextGt.length;i++){
//             System.out.print(nextGt[i]+" ");
//         }
//     }
//     public static void main(String[] args){
//         int nums[]={6,8,0,1,3};
//         nextGreaterFromleft(nums);
//     }
// }

// public class p1{
//     public static void nextSmallerFromright(int nums[]){
//         Stack<Integer>s=new Stack<>();
//         int nextSm[]=new int[nums.length];
//         for(int i=nums.length-1;i>=0;i--){
//             while(!s.isEmpty()&&nums[s.peek()]>=nums[i]){
//                 s.pop();
//             }
//             if(s.isEmpty()){
//                 nextSm[i]=-1;
//             }else{
//                 nextSm[i]=nums[s.peek()];
//             }
//             s.push(i);

//         }

//         for(int i=0;i<nextSm.length;i++){
//             System.out.print(nextSm[i]+" ");
//         }
//     }
//     public static void main(String[] args){
//         int nums[]={6,8,0,1,3};
//         nextSmallerFromright(nums);
//     }
// }


// public class p1{
//     public static void nextSmallerformleft(int nums[]){
//         Stack<Integer>s=new Stack<>();
//         int nextSm[]=new int[nums.length];
//         for(int i=0;i<nums.length;i++){
//             while(!s.isEmpty()&&nums[s.peek()]>=nums[i]){
//                 s.pop();
//             }

//             if(s.isEmpty()){
//                 nextSm[i]=-1;
//             }else{
//                 nextSm[i]=nums[s.peek()];
//             }
//             s.push(i);
//         }

//         for(int i=0;i<nextSm.length;i++){
//             System.out.print(nextSm[i]+" ");
//         }

//     }
//     public static void main(String[] args) {
//         int nums[]={6,8,0,1,3};
//         nextSmallerformleft(nums);
//     }
// }


// valid parenthesis


// public class p1{
//     public static boolean validParenthesis(String str){
//         Stack<Character>s=new Stack<>();
//         for(int i=0;i<str.length();i++){
//             char ch=str.charAt(i);
//             if(ch=='('||ch=='{'||ch=='['){
//                 s.push(ch);
//             }else{
//                 if(s.isEmpty()){
//                     return false;
//                 }else{
//                     if(s.peek()=='('&&ch==')'||s.peek()=='{'&&ch=='}'||s.peek()=='['&&ch==']'){
//                         s.pop();
//                     }else{
//                         return false;
//                     }
//                 }
//             }
//         }

//         if(s.isEmpty()){
//             return true;
//         }else{
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         String str="({[]})(";
//         System.out.println(validParenthesis(str));
//     }
// }


// duplicate parenthesis


// next greate element with two array;  this is wrong  try again

// public class p1{
//     public static void nextgt(int nums1[],int nums2[]){
//         int n=nums2.length;
//         int arr[]=new int[n];
//         for(int i=0;i<n-1;i++){
//             int j;
//             for(j=i+1;j<n;j++){
//                 if(nums2[j]>nums2[i]){
//                     arr[nums2[i]]=nums2[j];
//                     break;
//                 }
              
//             }
//               if(j==n){
//                     arr[nums2[i]]=-1;
//                 }
//         }
//         for(int i=0;i<nums1.length;i++){
//             System.out.print(arr[nums1[i]]+" ");
//         }
//     }
//     public static void main(String [] args){
//         int nums1[]={4,1,2};
//         int nums2[]={1,3,4,2};
//         nextgt(nums1, nums2);
//     }
// }


// public class p1{
//     public static void nextGt(int nums2[],int nums1[]){
//         Stack<Integer>s=new Stack<>();
//         int nextGt[]=new int[nums2.length+1];
//         for(int i=nums2.length-1;i>=0;i--){
//             while(!s.isEmpty()&&nums2[s.peek()]<=nums2[i]){
//                 s.pop();
//             }
//             if(s.isEmpty()){
//                 nextGt[nums2[i]]=-1;
//             }else{
//                 nextGt[nums2[i]]=nums2[s.peek()];
//             }
//             s.push(i);
//         }
//         // for(int i=0;i<nextGt.length;i++){
//         //     System.out.print(nextGt[i]+" ");
//         // }

//         for(int i=0;i<nums1.length;i++){
//             System.out.print(nextGt[nums1[i]]+" ");
//         }
//     }
//     public static void main(String[] args) {
//         int nums1[]={4,1,2};
//         int nums2[]={1,3,4,2};
//         nextGt(nums2,nums1);
//     }
// }

// palindron linkedlist  charachter

// import java.util.*;
// public class p1{
//     public static class Node{
//         char data;
//         Node next;
//         public Node(char data){
//             this.data=data;
//             this.next=null;

//         }
//     }



//     public static boolean ispalindrom(Node head){
//         Stack<Character>s=new Stack<>();

        
//         Node temp=head;
//         while(temp!=null){
//             s.push(temp.data);
//             temp=temp.next;
//         }
//         temp=head;
//         while(temp!=null){
           
//              if(s.peek()!=temp.data){
//              return false;

//              }else{
//                 s.pop();
//                 temp=temp.next;
//              }

//         }
//         return true;

//     }
//     public static void main(String[] args){
//         Node n1=new Node('A');
//         Node n2=new Node('B');
//         Node n3=new Node('C');
//         Node n4=new Node('B');
//         Node n5=new Node('A');
//         n1.next=n2;
//         n2.next=n3;
//         n3.next=n4;
//         n4.next=n5;
    

       


//         System.out.println(ispalindrom(n1));
        

//     }
// }






 ////   smmalest index   in this problem use prefix max and suffix min ,int k;
  // then Math.abs(prefix[i]-suffix[i]<=k) return i either return -1;
  

// public class p1{
//     public static int smallestIndex(int nums[],int k){
//         int n=nums.length;

//         int min[]=new int[n];
//         int max[]=new int[n];

//         max[0]=nums[0];
//         min[n-1]=nums[n-1];
//         for(int i=1;i<n;i++){
//             max[i]=Math.max(max[i-1],nums[i]);
//         }
//         for(int i=n-2;i>=0;i--){
//             min[i]=Math.min(min[i+1],nums[i]);
//         }
//         for(int i=0;i<nums.length;i++){
//             if(Math.abs(max[i]-min[i])<=k){
//                 return i;
//             }
//         }
//         return -1;

//     }
//     public static void main(String[] args){
//         // int nums[]={5,0,1,4};
//         int nums[]={1,1};
//         int k=1;
//         System.out.println(smallestIndex(nums, k));

//     }
// }




//  histgram  problem  if empty nsr[i]=n and if emppty then nsl[i]=-1;

// public class p1{
//     public static int  largestHistgram(int ht[]){

//         int n=ht.length;
//         int nsmR[]=nextSmR(ht);
//         int nsmL[]=nextSmL(ht);
//         int ans=Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             int h=ht[i];
//             int width=nsmR[i]-nsmL[i]-1;
//             int curr=width*h;
//             ans=Math.max(ans,curr);

//         }
//         return ans;


//     }

//     public static int[] nextSmR(int ht[]){
//         int n=ht.length;
//         Stack<Integer>s=new Stack<>();
//         int nsR[]=new int[n];


//         for(int i=n-1;i>=0;i--){
//             while(!s.isEmpty()&&ht[s.peek()]>=ht[i]){
//                 s.pop();
//             }
//             if(s.isEmpty()){
//                 nsR[i]=n;
//             }else{
//                 nsR[i]=s.peek();
//             }
//             s.push(i);
//         }
//         return nsR;


//     }

//        public static int[] nextSmL(int ht[]){
//         int n=ht.length;
//         Stack<Integer>s=new Stack<>();
//         int nsL[]=new int[n];


//         for(int i=0;i<n;i++){
//             while(!s.isEmpty()&&ht[s.peek()]>=ht[i]){
//                 s.pop();
//             }
//             if(s.isEmpty()){
//                 nsL[i]=-1;
//             }else{
//                 nsL[i]=s.peek();
//             }
//             s.push(i);
//         }
//         return nsL;


//     }





//     public static void main(String[] args) {
//         // int ht[]={2,1,5,6,2,3};
//         // int ht[]={2,4};
//         int ht[]={9,0};
//        System.out.println(largestHistgram(ht));
//     }
// }



public class p1{
  public static String decodeString(String str){
    Stack<Character>s=new Stack<>();
    String ans="";
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      if(ch=='#'){
        s.pop();

      }else{
        s.push(ch);
      }
    }
    while(!s.isEmpty()){
      ans=s.peek()+ans;
      s.pop();
    }

    
    return ans;
  }
  public static void main(String[] args) {
      String str="ab#c";
      System.out.println(decodeString(str));
  }
}