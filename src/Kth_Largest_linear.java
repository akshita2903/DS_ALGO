import java.util.*;
class Kth_Largest_linear {
//use quick sort-> approx(O(n)) and space->O(1)
    //for guranteed O(n),first shuffle then apply same concept
    
    public int findKthLargest(int[] nums, int k) {
   int n=nums.length;
        int kth_index=n-k; // for k =1,kth index=n-1
        //shuffle
        shuffle(nums,n);
        int low=0,high=n-1;
        while(low<high) //this runs O(n) time at max
        {
            int pivot_indx=find_pivot_indx(nums,low,high);
            if(pivot_indx>kth_index) //kth lies on left of pivot_indx
            {
                high=pivot_indx-1;
            }
            else if(pivot_indx<kth_index) //lies on rhs of pivot
            {
                low=pivot_indx+1;
            }
            else break;
        }
        return nums[kth_index];
    }
    int find_pivot_indx(int[] nums,int low,int high)
    {
        int i=low,j=high;
        int pivot_elmnt=nums[low],pivot_idx=low;
       while(i<j)
       {
           while(i<high && nums[i]<=pivot_elmnt) i++;
           while(j>low && nums[j]>pivot_elmnt) j--;
           if(i>=j) break;
           swap(nums,i,j);
          
       }
        swap(nums,pivot_idx,j);
        return j;
    }
    void shuffle(int[] a,int n)
    {
        Random rand=new Random();
        for(int i=n-1;i>0;i--)
        {
            int index=rand.nextInt(i+1);
            //System.out.println("indx "+index+" i "+i);
            swap(a,index,i);
        }
       // System.out.println(Arrays.toString(a));
    }
    void swap(int[] a,int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}


//time->O(n) guarnteed and space->O(1)
