package sortings_and_searching.sortings.important;

public class painter_partition_problem {
    static long minTime(int[] arr,int n,int k){
        //code here
        return time(arr,n,k);
    }
    static long sum(int a[],int n){
        long sum=0L;
        for(int i=0;i<n;i++) sum+=a[i];
        return sum;
    }
    static long max(int a[],int n){
       long max=0L;
       for(int i:a){
           if(max<i) max=i;
       }
       return max;
    }
    static long time(int a[],int n,int k){
        long ans=-1L,high=sum(a,n),low=max(a,n);
       
        while(low<=high){
            long mid=low+(high-low)/2;
            if(valid(mid,a,n,k))
            {
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    static boolean valid(long mid,int a[],int n,int k){
       long painter=1L,sum=a[0];
       for(int i=1;i<n;i++){
           sum+=a[i];
           if(sum>mid){
               painter++;
               sum=a[i];
           }
           if(painter>k) return false;
       }
        return true;
    }
}
