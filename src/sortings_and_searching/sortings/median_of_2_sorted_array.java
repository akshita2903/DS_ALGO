package sortings_and_searching.sortings;
import java.util.*;
public class median_of_2_sorted_array {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length,n2=nums2.length;
              if(n1<n2) return findmedian(nums1,nums2) ;
                else return findmedian(nums2,nums1);
            }
            //---------BEST APPROAH WITH SPACE->O(1) and time->O(log(min(n1,n2)))
            public double findmedian(int a[],int b[]){ //a is always min size make sure
               int l=0,h=a.length,n1=a.length,n2=b.length,len=(n1+n2)%2;
                while(l<=h){
                    int mid1=(l+h)/2; //smaller n1
                    int mid2=((n1+n2+1)/2)-mid1; //larger n2
                    int left1=(mid1==0)?Integer.MIN_VALUE:a[mid1-1];
                int right1=(mid1==n1)?Integer.MAX_VALUE:a[mid1];
                      int left2=(mid2==0)?Integer.MIN_VALUE:b[mid2-1];
                int right2=(mid2==n2)?Integer.MAX_VALUE:b[mid2];
                    if(left1<=right2 && left2<=right1){
                        return (len==0)?((Math.max(left1,left2)) +Math.min(right1,right2))/2.0:Math.max(left1,left2);
                    }
                    else if(left1>right2) h=mid1-1;
                    else if(left2>right1) l=mid1+1;
                    
                   
                    
                }
                return 0.0;
            }
            //NAIVE APPROACH WITH SPACE_.O(1) is to use two pointer
            //or space->O(m+n) by storing arrays in another single array the finding median
    
}
