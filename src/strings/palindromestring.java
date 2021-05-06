public class palindromestring {
    public boolean isPalindrome(String s) {
        int left=0,right=s.length()-1;
             while(left<=right)
             {
                 char cl=s.charAt(left);
                 char cr=s.charAt(right);
                 if(!Character.isLetterOrDigit(cl)) left++;
                 else if(!Character.isLetterOrDigit(cr)) right--;
                 else{
                     if(Character.toUpperCase(cl)!=Character.toUpperCase(cr))
                         return false;
                     else {
                         left++;
                         right--;
                     }
                 }
               
                 
             }
             return true;
             
         }
    
} //time->O(n) in n/2,n->lenght of string
/* TestCAse->Input: s = "A man, a plan, a canal: Panama"
Output: true*/ 
