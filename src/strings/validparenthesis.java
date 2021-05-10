import java.util.*;
public class validparenthesis {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
         for(int i=0;i<s.length();i++) //time->O(n) ,n=length of string
         {
             char c=s.charAt(i);
             if(c=='('||c=='{'||c=='[') st.push(c); //time->O(1)
           else  if(st.isEmpty()) return false;
             else{
                 char x=st.pop(); //time->O(1);
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
//overall time->O(n), and space->O(n);
