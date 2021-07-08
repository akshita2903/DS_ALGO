package sortings;
import java.util.*;
class min_swap_to_sort
{
  //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        int a[]=new int[nums.length];
        for(int i=0;i<nums.length;i++) a[i]=nums[i];
        Arrays.sort(a); //O(nlogn)
        return min_swap(a,nums,a.length);
    }
    int min_swap(int a[],int nums[],int n){
        HashMap<Integer,Integer> mp=new HashMap<>();
        int count=0;
        for(int i=0;i<n;i++){
            mp.put(nums[i],i);
        }
        for(int i=0;i<n;i++){ //O(n)
            if(nums[i]!=a[i]){ //if nums[i] is not in correct pos then finding its correct pos from hashmap and putting it in its cp
                count++;
                int t=nums[i];
                int pos=mp.get(a[i]);
                int y=nums[i];
                nums[i]=nums[pos];
                nums[pos]=y;
                mp.put(t,pos);
                mp.put(a[i],i);
                
               
            }
        }
        return count;
    }
}
//Time->O(nlogn) and space->O(n) for sorted array
