class countandsay{
    int res=0; 
    public String countAndSay(int n) {
String res="1";
        int x=1;
        if(n==1) return res;
        for(int i=1;i<n;i++) //O(n)
        {
            StringBuilder sb=new StringBuilder();
            for(int j=1;j<=res.length();j++)//O(res.length())
            {
         if(j<res.length() && (res.charAt(j-1)==res.charAt(j))) 
                    x++;
                else{
                    sb.append(x);
                    sb.append(res.charAt(j-1));
                    x=1;
                }
            }
            res=sb.toString();
        }
        return res;
        //t.c-> O(n)*O(res.length())
     
      
        
    }
}