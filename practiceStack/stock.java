
import java.util.Stack;

public class stock {
    public static void stackproblem(int stock[]){
        Stack<Integer>s=new Stack<>();
        int span[]=new int[stock.length];
        span[0]=1;
        s.push(0);
        for(int i=1;i<stock.length;i++){
            int currPrice=stock[i];
        while(!s.isEmpty()&&currPrice>stock[s.peek()]){
            s.pop();
        }
            if(s.isEmpty()){
                span[i]=i+1;
            }else{
                int prevh=s.peek();
               span[i] =i-prevh;
            }
            s.push(i);
        }

        

        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }
    }
    public static void main(String[] args){
        int stock[]={100,80,60,70,60,85,100};
        stackproblem(stock);

    }
    
}
