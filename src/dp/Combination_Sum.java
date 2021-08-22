import java.util.*;
class Combination_Sum{
   List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] c, int target) {
       Arrays.sort(c);
        comb(c,new ArrayList<Integer>(),target,0);
        return ans;
    }
    void comb(int[] A,ArrayList<Integer> res,int target,int start)
    {
        if(target>0){
            for(int i=start;i<A.length && target>=A[i];i++)
            {
                res.add(A[i]);
                comb(A,res,target-A[i],i);
                res.remove(res.size()-1);
            }
        }
        if(target==0 && !ans.contains(new ArrayList<Integer>(res))) {
           
           ans.add(new ArrayList<Integer>(res));
        }
    }
}
