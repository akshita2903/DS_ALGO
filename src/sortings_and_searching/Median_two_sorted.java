package sortings_and_searching;
import java.util.*;
class Median_two_sorted{
   public double findMedianSortedArrays(int[] nums1, int[] nums2) {
int n1=nums1.length,n2=nums2.length;
//         int med=(n1+n2)/2;
//         int size=n1+n2;
//         int prev=0,curr=0;
//         int i=0,j=0,count=0;
//         while(count<=med){
//            prev=curr;
//        if(i>=n1){
//            if(j<n2)  curr=nums2[j++];
//        }
//             else if(j>=n2){
//                 if(i<n1)curr=nums1[i++];
//             }
//             else{
//                 if(nums1[i]<=nums2[j]) curr=nums1[i++];
//                 else curr=nums2[j++];
//             }
//             count++;
    
//         }
//         if(size %2==0) return (prev+curr)/2.0;
//         return curr;  //t.c->O((m+n)/2)
double ans=n1<n2?Find(nums1,nums2):Find(nums2,nums1);
        return ans;
    }
    double Find(int[] a,int[] b){
     
        int m=a.length,n=b.length;
           int low=0,high=m;
        int size=m+n;
        int median=(size+1)>>1;
        while(low<=high){
            int cut1=(low+high)/2;
            int cut2=median-cut1;
            int l1=cut1==0?min():a[cut1-1];
            int l2=cut2==0?min():b[cut2-1];
            int r1=cut1==m?max():a[cut1];
            int r2=cut2==n?max():b[cut2];
            if((l1<=r2) && (l2<=r1)) //valid cuts{
            {
                if(size % 2==0)
                    return (max(l1,l2)+min(r1,r2))/2.0;
                else return max(l1,l2);
            }
            else if(l1>r2){
                high=cut1-1;
            }
            else if(l2>r1){
                low=cut1+1;
            }
        }
        return 0.0;
      //t.c->O(log(min(m,n)))
    }
    int min(){
        return Integer.MIN_VALUE;
    }
    int max(){
        return Integer.MAX_VALUE;
    }
    int min(int a,int b){
        return a<=b?a:b;
    }
    int max(int a,int b){
        return a>=b?a:b;
    }
  
}
