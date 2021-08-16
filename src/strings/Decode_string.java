class Decode_string {
    public String decodeString(String s) {
Stack<String> res_st=new Stack<>();
        Stack<Integer> count_s=new Stack<>();
        int idx=0; String res="";
        while(idx<s.length()){
            char y=getchar(s,idx);
            if(Character.isDigit(y))
            {
                int count=0;
                while(idx<s.length() && Character.isDigit(getchar(s,idx)))
                {
                    count=count*10+((int)(getchar(s,idx))-(int)('0'));
                    idx++;
                }
                count_s.push(count);
            }
         else   if(getchar(s,idx)=='[')
            {
                idx++;
             res_st.push(res);
                res="";
            }
          else  if(getchar(s,idx)==']')
            {
                int repeat=count_s.pop();
                StringBuilder sb=new StringBuilder(res_st.pop());
                for(int i=0;i<repeat;i++)
                    sb.append(res);
              res=sb.toString();
              idx++;
                    
            }
            else {res+=Character.toString(getchar(s,idx));
                  idx++;
                 }
            
        }
        return res;
    }
    char getchar(String s,int i)
    {
        return s.charAt(i);
    }
}
