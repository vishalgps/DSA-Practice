import java.util.*;

// public class NextGreater {
//     public static void nextGreater(int arr[],Stack<Integer>s){
//         int ans[]=new int[arr.length];
//         for(int i=arr.length-1;i>=0;i--){
//             while(!s.isEmpty()&&arr[s.peek()]<=arr[i]){
//                 s.pop();
//             }
//             if(s.isEmpty()){
//                 ans[i]=-1;
//             }else{
//                 ans[i]=arr[s.peek()];
//             }
//             s.push(i);
//         }

//         for(int i=0;i<ans.length;i++){
//             System.out.print(ans[i]+" ");
//         }
//     }
//     public static void main(String[] args){
//         int arr[]={6,8,0,1,3};
//         Stack<Integer>s=new Stack<>();
//         nextGreater(arr, s);
//     }
    
// }

// next greate element given two array 
// arr1[]={4,1,2}, arr2[]={1,3,4,2};
// output ={-1,3,-1};

public class NextGreater{
    public static void nextGreater(int nums1[],int nums2[]){
        Stack<Integer>s=new Stack<>();
        int n=nums2.length;
        int nextGt[]=new int[n+1];
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty()&&nums2[s.peek()]<=nums2[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGt[nums2[i]]=-1;
            }else{
                nextGt[nums2[i]]=nums2[s.peek()];

            }
            s.push(i);
        }
        System.out.println();
        for(int i=0;i<nums1.length;i++){
            System.out.print(nextGt[nums1[i]]+" ");
        }
    }
    public static void main(String[] args){
        int nums1[]={4,1,2};
        int nums2[]={1,3,4,2};
        nextGreater(nums1, nums2);
    }
}