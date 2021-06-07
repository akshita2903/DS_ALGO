class solution{
static int maxGold(int n, int m, int M[][])
    {
       return gold(M,n,m);
    }
    static int gold(int a[][],int m,int n)
    {
        int max=0,k=0;
        for(int i=n-2;i>=0;i--) //last column
       {
           for(int j=0;j<m;j++) //last row
           {
               int move_right=a[j][i+1];
               int move_right_up=(j==0)?0:a[j-1][i+1];
               int move_right_down=(j==m-1)?0:a[j+1][i+1];
            a[j][i]=a[j][i]+Math.max(move_right,Math.max(move_right_up,move_right_down));
            max=Math.max(a[j][i],max);
           }
       }
      // for(int i=0;i<m;i++) max=Math.max(max,a[i][0]);
       return max;
    }
}
//time->O(n*m)  
