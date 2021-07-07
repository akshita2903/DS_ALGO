package strings;
import java.util.*;
class longest_substring_without_repeating_char {
    public int lengthOfLongestSubstring(String s) {
        //NAIVE APPROACH
        HashSet<Character> h=new HashSet<>();
        int max=0; String x="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            /*storing char in string x*/
            x+=Character.toString(c);
            if(h.isEmpty()) h.add(c);//if set is empty dont check for duplicates
            else{
               if(h.contains(c)){ //chk if set has previously stored char
                   max=Math.max(max,x.length()-1); //max(set/string size,max)
                  
                   int p=0;
                   //find all char which are on left of that repeating char
                   while(p<x.length() && x.charAt(p)!=c)
                   {
                      //removing all char which are on left of repeatingchar
                       h.remove(x.charAt(p));
                       p++;
                   }
                   //updating string x by removing thart extra repeating char 
                  if((p+1)<x.length()){
                      x=x.substring(p+1);
                  }
                   
               }
                else h.add(c);
                    
                }
                
            }
           
        //if no repeatingc har are found tilll edn then size of set/stringis max answer
        max=Math.max(h.size(),max);
        return max;
        
    } //time->O(n*n) worst case
    
    //BETTER APPROACH
    
        public int lengthOls(String s) {
          return solve(s);
        }
        int solve(String s){
            HashMap<Character,Integer> mp=new HashMap<>();
            int max=0,j=0;
            for(int i=0;i<len(s);i++){
                char c=ch(s,i);
                if(!empty(mp) && mp.containsKey(c))
                    j=max(j,mp.get(c)+1);
                mp.put(c,i);
                max=max(max,i-j+1);
            }
            return max;
        }
        char ch(String s,int i){
            return s.charAt(i);
        }
        int len(String s){
            return s.length();
        }
        int max(int x,int y){
            return (x>y)?x:y;
        }
        boolean empty(HashMap<Character,Integer> m){
        return (m.isEmpty())?true:false;
        }
    }
    //o(n)
