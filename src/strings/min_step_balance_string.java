package strings;
public class min_step_balance_string {
    public int minInsertions(String s) {
        s=s.replace("))","}");
        int left=0,ans=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(')//left
                left++;
            else if((c=='}'|| c==')') && left>0)
            {
                ans+=c==')'?1:0;
                left--;
            }
            else if(c=='}'|| c==')' ){
                ans+=c==')'?2:1;
            }
        }
        return ans+2*left;
    } //time->O(n) ans space->O(1)
    
}
