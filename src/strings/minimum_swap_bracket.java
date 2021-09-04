package strings;
public class minimum_swap_bracket

{
    static int minimumNumberOfSwaps(String S){
        // code here

        int ans=0,open=0,close=0,balance=0;
        for(int i=0;i<S.length();i++)
        {
            char c=S.charAt(i);

            if(c=='[')
            {
                open++;
                if(balance>0) //if string is unbalance add balance ans
                 {
                    ans+=balance;
                    balance--; // since min swap allowed are 1 only
                }

            }
            else{
                close++;
                if(close>open) //if closing brackets become>opening count how many swaps required
                 balance=close-open;
            }

        }
        return ans;
    }
}
//time->O(length of string)
//space->O(1)