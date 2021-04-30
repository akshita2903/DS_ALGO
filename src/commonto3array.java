/**
 * commonto3array
 */
import java.util.*;
public class commonto3array {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int o=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        int c[]=new int[o];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        for(int i=0;i<n;i++)b[i]=sc.nextInt();
        for(int i=0;i<n;i++)c[i]=sc.nextInt();
        Solution s=new Solution();
        ArrayList<Integer> ls=new ArrayList<>();
        ls=s.commonElements(a,b,c,n,m,o);
    System.out.println((ls.isEmpty())?-1:ls);
    sc.close();

    }
}
class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
      ArrayList<Integer> l=new ArrayList<>();
      int i=0,j=0,k=0,p=0;
     for( p=0;p<n1-1;p++)// removing duplicates from array A in O(n1) time with constant space of O(1);
     {
         if(A[p]!=A[p+1]) A[i++]=A[p];
     }
     A[i++]=A[n1-1];
     n1=i; i=0;
     for( p=0;p<n2-1;p++)// removing duplicates from array B in O(n2) time with constant space of O(1);
     {
         if(B[p]!=B[p+1]) B[j++]=B[p];
     }
     B[j++]=B[n2-1];
     n2=j; j=0;
     for( p=0;p<n3-1;p++)// removing duplicates from array C in O(n3) time with constant space of O(1);
     {
         if(C[p]!=C[p+1]) C[k++]=C[p];
     }
     C[k++]=C[n3-1];
     n3=k; k=0;
      while(i<n1 && j<n2 && k<n3) //time->O(n1+n2+n3)
      {
          if(A[i]==B[j] && B[j]==C[k])
          {
              l.add(A[i]);
              i++;
              j++;
              k++;
          }
         else if(A[i]<B[j]) i++;
      else    if(B[j]<C[k]) j++;
          else k++;
      }
      return l;
    }
}
/*overall Time->O(n1+n2+n3) ans space->O(n1+n2+n3) for worst Case*/ 