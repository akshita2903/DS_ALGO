package minimum_jump;
import java.util.*;

public class greedy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
      System.out.println(minjump(a));
      sc.close();
    }
    static int minjump(int arr[])
    {
      
        int n=arr.length;
        int farthest=arr[0],curr=arr[0],jump=1;
        if(arr[0]==0)return -1; // if a[0]===0->maximum jump we can take from a[0] is of 0 length,so unable to reach end
        if(n==1) return 0; //if we are already at end of arry so jump require=0
        for(int i=1;i<n;i++)
        {
            farthest=Math.max(i+arr[i],farthest); //farthest ditance it can reach from i
            if(i==curr) {
                jump++;
                curr=farthest;
            }
            if(curr>=n-1) break;
        }
        return curr>=n-1?jump:-1;

    }
}
