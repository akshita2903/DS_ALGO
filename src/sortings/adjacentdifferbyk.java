 import java.util.*;
public class adjacentdifferbyk {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int k=sc.nextInt();
        int x=sc.nextInt();
        System.out.println(find(a,n,k,x));
        s.close();

    }
    static int find(int a[],int n,int k,int x)
    {int i=0;
        while(i<n)
        {
            if(a[i]==x) return i;
            i+=Math.max(1,Math.abs(x-a[i])/k);
        }
        return -1;
    }

}
