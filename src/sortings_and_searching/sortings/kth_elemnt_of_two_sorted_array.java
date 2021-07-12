package sortings_and_searching.sortings;
import java.util.*;
public class kth_elemnt_of_two_sorted_array {
    public static long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        if(n>m) return elmntis(arr2,arr1,m,n,k);
        return elmntis(arr1,arr2,n,m,k);
    }
    //---NAIVE approch
    //time->O(n+m) and space->O(n+m)
    //1-merge arrays into single array uisng two pointer return newarray[k-1] ->0th base index
    //time->O(n+m) and space->O(1)
    //2-don merge just make count of array using two pointer and chk if (cnt==k) return the elemnt
    //-----------------------------------------------------------------------//
    //using binary search space->O(1) and time->(o(log(min(n1,n2))))
    public static long elmntis(int a[],int b[],int n1,int n2,int k){
        int low=max(0,k-n2),high=min(n1,k); //EDGE CASE
        while(low<=high){
            int cut1=low+(high-low)/2;
            int cut2=k-cut1;
            int left1=cut1==0?mini():a[cut1-1];
            int right1=cut1==n1?maxi():a[cut1];
            int left2=cut2==0?mini():b[cut2-1];
            int right2=cut2==n2?maxi():b[cut2];
            if(left1<=right2 && left2<=right1)
            return Long.valueOf(max(left2,left1));
            else if(left1>right2) high=cut1-1;
            else if(left2>right1) low=cut1+1;
            
            
        }
        return 0L;
    }
  static  int max(int i,int j){
        return Math.max(i,j);
    }
   static  int min(int i,int j){
        return Math.min(i,j);
    }
  static   int mini(){
        return Integer.MIN_VALUE;
    }
 static    int maxi(){
        return Integer.MAX_VALUE;
    }
    
}
