package arrays;
class trap_Rain_water{
    public int trap(int[] height) {
        return water_trapped(height,height.length);
        
    }
    int water_trapped(int a[],int n){
        int left=0,right=n-1,left_max=0,right_max=0;
        int res=0;
        while(left<right)
        {
            if(a[left]<=a[right]){
                if(a[left]>=left_max) left_max=a[left];
                else res+=left_max-a[left];
                left++;
            }
            else{
                if(a[right]>right_max)
                    right_max=a[right];
                
                //base important
                else res+=right_max-a[right];
                right--;
            }
        }
        return res;
    }
}
//space->O(1) and time->O(N)