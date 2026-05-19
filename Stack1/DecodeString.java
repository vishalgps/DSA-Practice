
import java.util.Stack;


// import java.util.*;
// public class DecodeString {
//     public static String decodeString(String str){
//         char ch[]=str.toCharArray();
//         Stack<Integer>s1=new Stack<>();
//         Stack<String>s2=new Stack<>();
//         int count=0;
//         String res="";

//         for(char arr:ch){
//             if(Character.isDigit(arr)){
//                 count=count*10+(arr-'0');
//             }else if(arr=='['){
//                 s1.push(count);
//                 s2.push(res);
//                 count=0;
//                 res="";
//             }else if(arr==']'){
//                 int freq=s1.pop();
//                 StringBuilder temp=new StringBuilder(s2.pop());
//                 for(int i=0;i<freq;i++){
//                     temp.append(res);
//                 }
//                 res=temp.toString();
               
//             }else{
//                 res+=arr;
//             }
           
//         }
//         return res;
//     }
//     public static void main(String []args){
//         // String str="2[ab]";
//         // String str="3[a]2[bc]";
//         String str="3[a2[c]]";
//         System.out.println(decodeString(str));
//     }
// }

public class DecodeString{
    public static String decodeString(String str){
        Stack<Integer>d=new Stack<>();
        Stack<String>s=new Stack<>();
        int countDigit=0;
        String ans="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                countDigit=countDigit*10+(ch-'0');
            }else if(ch=='['){
                d.push(countDigit);
                s.push(ans);
                ans="";
                countDigit=0;
            }else if(ch==']'){
                int digit=d.pop();
                String prevStr=s.pop();
                String temp="";
                for(int k=0;k<digit;k++){
                    temp+=ans;
                }
                ans=temp+prevStr;
            }else{
                ans+=ch;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str="2[ab]";
        System.out.println(decodeString(str));
    }
}