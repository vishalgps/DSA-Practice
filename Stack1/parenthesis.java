import java.util.*;

// public class parenthesis {
//     public static boolean isvalid(String str){
//         Stack<Character>s=new Stack<>();
      
//         int idx=0;
//         while(idx!=str.length()){
//             char ch=str.charAt(idx);
//             if(ch=='('||ch=='{'||ch=='['){
//                 s.push(ch);
//             }else{
//                 // this case for only closing ho not opening then also this string not valid
//                 if(s.isEmpty()){
//                     return false;
//                 }

//                 if((s.peek()=='('&&ch==')')||(s.peek()=='{'&&ch=='}')||(s.peek()=='['&&ch==']')){
//                     s.pop();
//                 }else{
//                     return false;
//                 }

//             }
//             idx++;
//         }
        
//        if(s.isEmpty()){
//         return true;
//        }else{
//         return  false;
//        }
//     }
//     public static void main(String[] args) {
//         String str="({})[]";
//         System.out.println(isvalid(str));
        
//     }
// }


// duplicate parenthesis

public class parenthesis{
    public static boolean isDuplicate(String str){
        Stack<Character>s=new Stack<>();
        int n=str.length();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            // closing case

            if(ch==')'){
                int count=0;
                while(!s.isEmpty()&&s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true; // duplicate exists
                }else{
                    s.pop();
                }
            }else{
                // opening
                s.push(ch);

            }
        }
        return false;

    }
    public static void main(String[] args) {
        String str="((a+b))";
        String str1="(a-b)";
        System.out.println(isDuplicate(str1));
    }
}

    




