package arrays;
import java.util.*;
public class mergeintervals {
    //my approach
    public int[][] merge(int[][] intervals) {
        int m =intervals.length;
        int a[][]=new int[m][2];//O(m)->space
        int i=0,j=0;
        int s[]=new int[m]; //O(m) =>space
        int e[]=new int[m]; //O(m)
        for(i=0;i<m;i++) //O(m) ->time
        {
            s[i]=intervals[i][0];
            e[i]=intervals[i][1];
        }
        Arrays.sort(s); Arrays.sort(e); //O(mlogm)
    for(i=0;i<m;i++) a[i][1]=-1; //o(m)
        i=0;
        
        a[0][0]=s[0];
        a[0][1]=e[0];
        for(j=1;j<m;j++) //O(m)
        {
            if(s[j]<=e[j-1])
            {
             
                   if(a[i][1]>=s[j])  a[i][1]=e[j];
                else{
                    i++;
                    a[i][0]=s[j-1];
                    a[i][1]=e[j];
                }
                
                }
            else{
                if(a[i][1]>=s[j]) a[i][1]=e[j];
                else{
                    i++;
                    a[i][0]=s[j];
                    a[i][1]=e[j];
                }
            }
            }
        int ans[][]=new int[i+1][2]; //O(I)->space
        for(j=0;j<=i;j++){
            ans[j][0]=a[j][0];
            ans[j][1]=a[j][1];
        }
        return ans;
        
    }

//time->O(m+mlogm) and space O(2*m)
//another approach might be complex
public int[][] merge1(int[][] intervals) {
    int m =intervals.length;
   List<int[]> ls=new ArrayList<>();
Arrays.sort(intervals,(i1,i2)->(Integer.compare(i1[0],i2[0])));//using comparator(lambda)
    int st=intervals[0][0];
    int e=intervals[0][1];
    for(int i[]:intervals)
    {
        if(i[0]<=e) e=Math.max(i[1],e);
        else{
            ls.add(new int[]{st,e});
                st=i[0];
            e=i[1];
        }
    }
    ls.add(new int[]{st,e});
    return ls.toArray(new int[ls.size()][]);
    
}
}