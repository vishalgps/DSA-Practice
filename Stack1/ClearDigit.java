
import java.util.*;
public class ClearDigit {
    public static String clearDigit(String str){
        Stack<Character>s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){

                if(!s.isEmpty()){
                    s.pop();
                }
            }else
            s.push(ch);
        }
        String ans="";
        if(s.isEmpty()){
            return "empty";
        }
        while(!s.isEmpty()){
            ans=s.peek()+ans;
            s.pop();
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        // String str="abc";
        String str="bc34";

        System.out.println(clearDigit(str));
    }
    
}
