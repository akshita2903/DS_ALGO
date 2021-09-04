package sortings_and_searching;
import java.util.*;
public class foursumgfg {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        Arrays.sort(arr);
        return findSum(arr,k);
    }
    static ArrayList<ArrayList<Integer>> findSum(int a[],int x){
        int n=a.length;
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n-3;i++) //first element
        {
            
            for(int j=i+1;j<n-2;j++) //second element
            {
              
                int lp=j+1;
                int r=n-1;
                 while((lp<n)&&lp<r)
                {
                    int sum=a[i]+a[j]+a[lp]+a[r];
                    if(sum==x){
                    ArrayList<Integer> res=new ArrayList<>();
                    res.add(a[i]);
                    res.add(a[j]);
                    res.add(a[lp]);
                    res.add(a[r]);
                    if(!ans.isEmpty() && ans.contains(res))
                    {
                        //dont add
                    }
                    else ans.add(res);
                    lp++;
                    r--;
                    }
                    else if(sum<x) lp++;
                    else r--;
                }
             }
        }
        return ans;
    }
}
//time->O(n^3) for better
//time->O(n^3)+O(logn)+O(nlogn) for brute forces using 3ptr and binary search
//time>O(n^4) for four for loops direct ans

