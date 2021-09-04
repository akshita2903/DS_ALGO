package heap;
import java.util.*;
public class kth_largest_sum_contiguous {
    static Scanner s=new Scanner(System.in);
    static int sum(int a[],int n,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        a[0]=a[0]+0;
       for(int i=1;i<n;i++) a[i]+=a[i-1];
        // for(int i:a) System.out.print(i+"  ");
        // System.out.println();
      
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++)
            {
                int diff=0;
                if(i==j) diff=a[i];
                else diff=a[j]-a[i];
               
          //  System.out.println(diff+"abc");
                
               pq.add(diff);
               if(pq.size()>k) pq.poll();
                
            }
        }
        return pq.peek();
    }
    
    
    
    
    public static void main(String str[]){
        int n=s.nextInt();
        int a[]=new int[n];
  
        for(int i=0;i<n;i++) a[i]=s.nextInt();
              int k=s.nextInt();
        System.out.println(sum(a,n,k));
    }
    
}
//time->O(n*n log k) ans space->O(1)