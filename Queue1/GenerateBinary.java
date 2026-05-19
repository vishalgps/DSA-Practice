
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinary {
    public static String generateBinary(int n){
        Queue<String>s=new LinkedList<>();
        String s1=" ";
        s.add("1");
        while(n>0){
             String s2=s.peek();
            s.remove();
           s1+=s2+" ";
            s.add(s2+"0");
             s.add(s2+"1");
            n--;
        }
        return s1;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(generateBinary(n));
    }
    
}
