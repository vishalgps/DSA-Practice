
import java.util.Stack;
public class histogram {
 
    public static int maxArea(int ht[]){

         int maxArea=0;
         int n=ht.length;
         int nsr[]=new int[n];
         int nsl[]=new int[n];
        //next smaller right
        Stack<Integer>s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty()&&ht[s.peek()]>=ht[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=n;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }

        // next smaller left

        //   Stack<Integer>st=new Stack<>();
        s=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty()&&ht[s.peek()]>=ht[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }

        
        System.out.println();
        for(int i=0;i<n;i++){
            int h=ht[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea=h*width;
            maxArea=Math.max(maxArea,currArea);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        // int ht[]={2,1,5,6,2,3};
        // int ht[]={2,4};
        int ht[]={9,0};

        System.out.println(maxArea(ht));
    }
    
}
