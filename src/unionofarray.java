public class unionofarray {
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
       HashSet<Integer> ls=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(!ls.contains(a[i])) ls.add(a[i]);
    }
    for(int i=0;i<m;i++)
    {
         if(!ls.contains(b[i])) ls.add(b[i]);
    }
    return ls.size(); //t.c =O(m+n)
}
    
}
