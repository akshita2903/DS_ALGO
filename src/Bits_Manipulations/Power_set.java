package Bits_Manipulations;
import java.util.*;
class Power_set{
   public List<String> AllPossibleStrings(String s)
    {
        ArrayList<String> l=new ArrayList();
        int n=pow(s.length());
      permutations(s,n,s.length(),l);
        return l;
    }
    void permutations(String s,int pow,int len,ArrayList<String> l)
    {
        String res="";
        for(int i=0;i<pow;i++){ //possible combinations(may/may not)
            res="";
            for(int j=0;j<len;j++) //it sets the number of bits to be used
            {
                if((i & (1<<j))>0) //find the set bit position and the char present at that position
                res+=s.charAt(j);
                
            }
            if(res!="")
            l.add(res);
        }
        Collections.sort(l);
    }
    int pow(int x){
        int res=2; x-=1;
        while(x!=0){
            res=(res*2);
            x--;
        }
        return res;
    }









}
