package strings;
class subtringof0and1{
    public int countBinarySubstrings(String s) {
        //if(s.length()<=1) return -1;
        int one=0, zero=0,last_element=-2;
        int count=0;
        for(int i=0;i<s.length();i++) //time complexity->O(length of string say n)
        {
            char c=s.charAt(i);
            if(c=='0')
            {
                if(last_element==1) zero=0;
                zero++;
                last_element=0;
            }
            else{
                if(last_element==0) one=0;
                one++;
                last_element=1;
            }
            if((last_element==0 && one>=zero)||(last_element==1 && zero>=one))
               count+=1;
        }
               return count;
      
}

}
//overall time complexity O(n) and space O(1)
    

