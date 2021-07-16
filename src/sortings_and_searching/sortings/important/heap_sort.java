package sortings_and_searching.sortings.important;
class heap_sort{
  //use merge sort(O(nlogn)) bubble/insertion sort(O(n*n))
  //HEAP-----------------------------------------------SORT
  public int[] sortArray(int[] nums) {
        return sorted_array(nums,nums.length);
        
    }

   int [] sorted_array(int nums[],int n){
        for(int i=n/2-1;i>=0;i--){
            heapify(nums,n,i);
        }
        for(int i=n-1;i>0;i--){
            swap(nums,i,0);
            heapify(nums,i,0);
        }
       return nums;
    }
    void heapify(int nums[],int n,int p){
        int l=p,lc=(2*p)+1,r=(2*p)+2;
        if(lc<n && nums[lc]>nums[l]){
            l=lc;
        }
        if(r<n&&nums[r]>nums[l]) l=r;
        if(l!=p) {swap(nums,l,p);
                  heapify(nums,n,l);
                 }
        else return;
    }
    void swap(int nums[],int i,int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
  //time->O(n) and space->O(1)
  
}
