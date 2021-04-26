import java.util.*;
public class duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
      System.out.println(findDuplicate(a));
    }
    static int findDuplicate(int[] nums) {
        int n=nums.length;
      /*  HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(!h.contains(nums[i])) h.add(nums[i]);
            else return nums[i];
        }
        return -1;     t.c=O(n),s.c=O(n)*/ 
        
        int slow=nums[0],fast=nums[0];
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);
            fast=nums[0]; //mov to start point
        while(slow!=fast)
        {
            fast=nums[fast];
            slow=nums[slow];
        }//move one index at max;
        return slow;   
        //used detect loop in ll ;T.c=O(n) and Space=O(1) for lsow and fast pointer only
        
    }
    
}
