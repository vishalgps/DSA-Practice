
import java.util.*;





// import java.util.*;

// public class reverseS {
    
//     public static String reverseS(Stack<Character>s,String str){
//         int idx=0;
//         while(idx<str.length()){
//             s.push(str.charAt(idx));
//             idx++;
//         }
//         StringBuilder st=new StringBuilder();
//         while(!s.isEmpty()){
//             char ch=s.pop();
//             st.append(ch);
//         }

//         return st.toString();

//     }
//     public static void main(String[] args) {
//         Stack<Character>s=new Stack<>();
//         String str="abc";
//         System.out.println(reverseS(s, str));

//     }
// }


// public class reverseS{
//     public static void pushAtBotton(Stack<Integer>s,int el){
//         if(s.isEmpty()){
//             s.push(el);
//             return;
//         }
//         int val=s.pop();
//         pushAtBotton(s, el);
//         s.push(val);
      

//     }

//     public static void reverseS(Stack<Integer>s){
//         if(s.isEmpty()){
//             return;
//         }
//         int top=s.pop();
//         reverseS(s);
//         pushAtBotton(s, top);

//     }
//     public static void main(String[] args) {
//         Stack<Integer>s=new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         pushAtBotton(s, 4);
//         reverseS(s);
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }

//     }
// }


