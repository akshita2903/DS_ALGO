package strings;
import java.util.*;
public class valid_parenthesis {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
         for(int i=0;i<s.length();i++)
         {
             char c=s.charAt(i);
             if(c=='('||c=='{'||c=='[') st.push(c);
           else  if(st.isEmpty()) return false;
             else{
                 char x=st.pop();
                 switch(x){
                     case '(':
                         {
                             if(c=='}'|| c==']') return false;
                             break;
                         }

                 case '{':
                 {
                     if(c==']'||c==')') return false;
                     break;
                 }
                     case '[':
                         {
                             if(c=='}'||c==')') return false;
                             break;
                         }
             }
         }
         }
             return st.isEmpty()?true:false;

     }

}
