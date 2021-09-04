package arrays;
import java.util.*;
public class count_distinct_elemnt_in_window {
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        ArrayList<Integer> l=new ArrayList<>();
        HashMap<Integer,Integer> h=new HashMap<>();
        if(n==0 || k>n) return l;
       int c=0;
       for(int i=0;i<k;i++){
           if(h.get(A[i])==null)
           {
               c++;
               h.put(A[i],1);
           }
           else h.put(A[i],h.get(A[i])+1);
       }
       l.add(c);
       for(int i=k;i<n;i++){
           int j=i-k;
           if(h.get(A[j])==1) c--; //occured already
           h.put(A[j],h.get(A[j])-1);
           if(h.get(A[i])==null || h.get(A[i])==0)
           {
               c++;
               h.put(A[i],1);
           }
           else{
               h.put(A[i],h.get(A[i])+1);
           }
           l.add(c);
       }
       return l;

       
    }
    
}
