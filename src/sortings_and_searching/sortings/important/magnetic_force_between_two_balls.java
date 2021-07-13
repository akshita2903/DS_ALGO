package sortings_and_searching.sortings.important;
import java.util.*;
public class magnetic_force_between_two_balls {
    public int maxDistance(int[] position, int m) {
        int n=position.length;
            Arrays.sort(position);
            return maxD(position,n,m);
        }
        int maxD(int a[],int n,int m){
            int ans=-1,low=0,high=a[n-1];
            while(low<=high){
                int mid=low+(high-low)/2;
                if(isvalid(mid,a,n,m)){
                    ans=mid;
                    low=mid+1;
                }
              else  high=mid-1;
            }
            return ans;
        }
        boolean isvalid(int mid,int a[],int n,int m){
            int balls=1,pos=a[0];
            for(int i=1;i<n;i++){
                int diff=a[i]-pos;
                if(diff>=mid){
                    balls++;
                      if(balls>=m) return true;
                   else pos=a[i];
                }
              
            }
            return false;
        }
    
}
