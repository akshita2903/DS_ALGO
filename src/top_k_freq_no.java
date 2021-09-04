import java.util.*;
class top_k_freq_no{
   public int[] topKFrequent(int[] nums, int k) {
      
      HashMap<Integer,Integer> mp=new HashMap<>();
      for(int i=0;i<nums.length;i++)
        mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
      return freq(k,mp);
        
    }
  int[] freq(int k,HashMap<Integer,Integer> mp){
    int res[]=new int[k];
    PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->mp.get(b)-mp.get(a));
    for(int x:mp.keySet()) q.add(x);
   
    for(int i=0;i<k;i++)
      res[i]=q.poll();
    return res;
  }
  
  
  
}
