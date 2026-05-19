import java.util.*;

public class BaseBall {
    public static int baseballGame(String ops[]){
        int sum=0;
        Stack<Integer>s=new Stack<>();
        for(int i =0;i<ops.length;i++){
            if(ops[i].equals("+")){  // ops[i].charAt[0]=='+'; and convert in digit  ops[i].charAt(0)-'0';
                int val1=s.peek();
                s.pop();
                int val2=s.peek();
                s.push(val1);
                s.push(val1+val2);


            }else if(ops[i].equals("C")){
                s.pop();
            }else if(ops[i].equals("D")){
                int val=s.peek();
                s.push(val*2);
            }else{
                s.push(Integer.parseInt(ops[i]));
            }
        }
        while(!s.isEmpty()){
            sum+=s.peek();
            s.pop();

        }
        return sum;
    }
    public static void main(String[] args){
         String ops[] = {"5","2","C","D","+"};
         System.out.println(baseballGame(ops));
    }
    
}
