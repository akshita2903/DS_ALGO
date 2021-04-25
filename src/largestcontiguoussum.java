public class largestcontiguoussum {
    int maxSubarraySum(int arr[], int n){
        int sum_till_now=0,max_sum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            sum_till_now+=arr[i];
            if(sum_till_now>=max_sum) max_sum=sum_till_now;
            if(sum_till_now<0) sum_till_now=0;
        }
        return max_sum;
           }
    
}
