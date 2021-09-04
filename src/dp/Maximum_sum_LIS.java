package dp;
import java.util.*;
import java.math.*;
class Maximum_sum_LIS{
  
  
	public int maxSumIS(int arr[], int n)  
	{  
	    int max_sum=maxis(arr,n);
	    return max_sum;
	} 
	int maxis(int a[],int n){
	    int dp[]=new int[n+1];
	    dp[0]=a[0];
	    for(int i=1;i<n;i++){
	        dp[i]=a[i];
	        for(int j=0;j<n;j++){
	            if(a[j]<a[i])
	            dp[i]=Math.max(dp[i],dp[j]+a[i]);
	        }
	    }
	    int max=0;
	    for(int i:dp) max=Math.max(max,i);
	    return max;
	      
	    
	    
	 
	}	
  
  
  
  
  
  
}
