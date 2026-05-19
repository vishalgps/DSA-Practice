
import java.util.*;

// public class TrappingWater {
//     public static int  trappingWater(int ht[]){
       
//         int low=0;
//         int high=ht.length-1;
//         int left=ht[0];
//         int right=ht[ht.length-1];
//         int max=Integer.MIN_VALUE;
//         int curr=0;
//         while(low<=high){
//             left=Math.max(left,ht[low]);
//             right=Math.max(right,ht[high]);
//             if(left<right){
//                 curr+=left-ht[low];
//                 low++;

//             }else{
//                 curr+=right-ht[high];
//                 high--;
//             }
//             max=Math.max(curr,max);
//         }
//         return max;





//     }
//     public static void main(String []args){
//         int ht[]={4,2,0,6,3,2,5};
//         System.out.println(trappingWater(ht));
//     }
// }

public class TrappingWater{
    public static int trappingWater(int ht[]){

        Stack<Integer>s=new Stack<>();
        int n=ht.length;
        int nextGR[]=new int[n];
        int nextGL[]=new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty()&&ht[s.peek()]<=ht[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGR[i]=-1;
            }else{
                nextGR[i]=ht[s.peek()];
            }
            s.push(i);
        }

        for(int i=0;i<n;i++){
            while(!s.isEmpty()&&ht[s.peek()]<=ht[i]){
                s.pop();

            }
            if(s.isEmpty()){
                nextGL[i]=-1;
            }else{
                nextGL[i]=ht[s.peek()];
            }
            s.push(i);
        }

        int trapping=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(nextGR[i],nextGL[i]);
           trapping+=waterlevel-ht[i];
           max=Math.max(max,trapping);

        }
        return max;


    }
    public static void main(String[] args){
        int ht[]={4,2,0,6,3,2,5};
        System.out.println(trappingWater(ht));

    }
}