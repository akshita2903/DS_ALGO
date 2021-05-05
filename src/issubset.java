import java.util.*;
public class issubset{
public String isSubset( long a1[], long a2[], long n, long m) {
    int n1=a1.length,n2=a2.length,c=0;
    ArrayList<Long> l=new ArrayList<>();
    for(int i=0;i<n2;i++) l.add(a2[i]);
    for(int i=0;i<n1;i++)
    {
        if(l.contains(a1[i])) c++;
    }
    return c==n2 ?"Yes":"No";
   // t.c-> O(n+m) and space=O(n+m)
    
    
}
}