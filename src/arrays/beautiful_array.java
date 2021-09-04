package arrays;
// ques->For some fixed n, an array nums is beautiful if it is a permutation of the integers 1, 2, ..., n, such that:

// For every i < j, there is no k with i < k < j such that nums[k] * 2 = nums[i] + nums[j].

// Given n, return any beautiful array nums.  (It is guaranteed that one exists.)
import java.util.*;
public class beautiful_array {
    public int[] beautifulArray(int n) {
        return array(n);
          
      }
    int[] array(int n){
      int ans[]=new int[n];
      ArrayList<Integer> l=new ArrayList<>();
      l.add(1);
      while(l.size()!=n){
      ArrayList<Integer> temp=new ArrayList<>();
        for(int i:l){
          if(check(2*i-1,n)) temp.add(2*i-1);
        }
        for(int i:l)
        {
          if(check(2*i,n)) temp.add(2*i);
        }
        l=temp;
      }
      for(int i=0;i<l.size();i++) ans[i]=l.get(i);
      return ans;
    }
    boolean check(int x,int n){
      return (x<=n);
    }
    
}
