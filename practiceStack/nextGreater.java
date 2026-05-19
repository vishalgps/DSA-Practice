
import java.util.Stack;



// import java.util.Stack;

// public class nextGreater{
//     public static void nextGreater(int nums[]){
//         Stack<Integer>s=new Stack<>();
//         int n=nums.length;
//         int nextgreater[]=new int[nums.length];
        
//         for(int i=n-1;i>=0;i--){
//             while(!s.isEmpty()&&nums[s.peek()]<=nums[i]){
//                 s.pop();

//             }
//             if(s.isEmpty()){
//                 nextgreater[i]=-1;
//             }else{
//                 nextgreater[i]=nums[s.peek()];
//             }
//             s.push(i);
//         }

//         for(int i=0;i<nextgreater.length;i++){
//             System.out.print(nextgreater[i]+" ");
//         }
//     }
//     public static void main(String[] args) {
//          int nums[]={6,8,0,1,3};
//          nextGreater(nums);

//     }
// }


// public class nextGreater{
//     public static void nextGt(int nums[]){
//         Stack<Integer>s=new Stack<>();
//         int n=nums.length;
//         int nextGt[]=new int[n];
//         for(int i=n-1;i>=0;i--){
//             int currel=nums[i];
//             while(!s.isEmpty()&&s.peek()<=currel){
//                 s.pop();
//             }
//             if(s.isEmpty()){
//                 nextGt[i]=-1;
//             }else{
//                 nextGt[i]=s.peek();
//             }
//             s.push(nums[i]);
//         }
//         for(int i=0;i<nextGt.length;i++){
//             System.out.print(nextGt[i]+" ");
//         }
//     }
//     public static void main(String[] args) {
//         // int nums[]={6,8,0,1,3};
//         // int nums[]={1,2,3,4,5};
//         int nums[]={1,2,1};
//         nextGt(nums);

//     }
// }


// next smaller from left side

// public class nextGreater{
//     public static void nextGrtFromleft(int nums[]){
//         Stack<Integer>s=new Stack<>();
//         int n=nums.length;
//         int ans[]=new int[n];
//         for(int i=0;i<nums.length;i++){
//             while(!s.isEmpty()&&nums[s.peek()]<=nums[i]){
//                 s.pop();
//             }
//             if(s.isEmpty()){
//                 ans[i]=-1;
//             }else{
//                 ans[i]=nums[s.peek()];
//             }
//             s.push(i);
//         }
//         for(int i=0;i<ans.length;i++){
//             System.out.print(ans[i]+" ");
//         }
//     }
//     public static void main(String[] args) {
//         int nums[]={6,8,0,1,2};
//         nextGrtFromleft(nums);


//     }

// }


//  next smaller from right

public class nextGreater{
    public static void nextSmallerfromrightside(int nums[]){
        Stack<Integer>s=new Stack<>();
        int n=nums.length;
        int smaller[]=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty()&&nums[s.peek()]>=nums[i]){
                s.pop();
            }
            if(s.isEmpty()){
                smaller[i]=-1;
            }else{
                smaller[i]=nums[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<smaller.length;i++){
            System.out.print(smaller[i]+" ");
        }
    }
    public static void main(String[] args) {
        // int nums[]={6,8,0,1,2};
        int nums[]={2,1,5,6,2,3};
        nextSmallerfromrightside(nums);
    }
}



// next smaller from left

// public class nextGreater{
//     public static void nextSmfromLeft(int nums[]){
//         int n=nums.length;
//         int sm[]=new int[n];
//         Stack<Integer>s=new Stack<>();
//         for(int i=0;i<n;i++){
//             while(!s.isEmpty()&&nums[s.peek()]>=nums[i]){
//                 s.pop();
//             }
//             if(s.isEmpty()){
//                 sm[i]=-1;
//             }else{
//                 sm[i]=nums[s.peek()];
//             }
//             s.push(i);
//         }

//         for(int i=0;i<sm.length;i++){
//             System.out.print(sm[i]+" ");
//         }
//     }
//     public static void main(String[] args) {
//         // int nums[]={6,8,0,1,2};
//         int nums[]={2,1,5,6,2,3};
//         nextSmfromLeft(nums);
//     }
// }