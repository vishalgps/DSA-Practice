
// import java.util.*;
// public class SimplyPath {
    
//     public static String simplypath(String str){
//         Stack<String>s=new Stack<>();
//         String []path=str.split("/");
//         for(String res:path){
//             if(res.equals("")||res.equals(".")){
//                 continue;
//             }else if(res.equals("..")){
//                 if(!s.isEmpty()){
//                     s.pop();
//                 }
//             }
//             else
//             s.push(str);
                
//         }
//         String ans="";
//         if(s.isEmpty()){
//             return "/";
//         }
      
//         while(!s.isEmpty()){
//             ans="/"+s.peek()+ans;
//             s.pop();

//         }
//         return ans;
//     }
//     public static void main(String [] args){
//         String str="/apnacollege/";
//         System.out.println(simplypath(str));
//     }
// }


import java.util.*;
public class SimplyPath{
    public static String simplyPath(String str){
        Stack<String>s=new Stack<>();
        String path[]=str.split("/");

        for(String str1:path){
            if(str1.equals("")||str1.equals(".")){
                continue;
            }else if(str1.equals("..")){
                if(!s.isEmpty()){
                    s.pop();
                }

            }else{
                s.push(str1);
            }
        }

        String ans="";
        if(s.isEmpty()){
            return "/";
        }
        while(!s.isEmpty()){
            ans="/"+s.peek()+ans;
            s.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        // String str="/a/./b/..//c/";
        String str="////";
        System.out.println(simplyPath(str));
    }
}




