package arrays;
public class moores_voting {

    public int majorityElement(int[] nums) {
        int n=nums.length;
       if(n==1) return nums[0];
       int cand=1,maj_ind=0;
        for(int i=1;i<n;i++) //O(N)
        {
            if(nums[maj_ind]==nums[i]) cand++; //finding candidate to be majority eleemnt
            else cand--;
            if(cand==0)
            {
                cand=1;
                maj_ind=i;
            }
        }
        return nums[maj_ind];
    }
}
//Time->O(n) ans space->O(1)