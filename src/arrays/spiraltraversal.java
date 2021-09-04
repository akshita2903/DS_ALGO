package arrays;
import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> l=new ArrayList<>();
        int m=matrix.length,n=matrix[0].length;
        int r=0,c=0,r1=m-1,c1=n-1;
        int v_c=0;
        while(r<=r1 && c<=c1)
        {
            for(int i=c;i<=c1;i++)
            {

                l.add(matrix[r][i]);
            }
       r++;
            for(int i=r;i<=r1;i++)
            {

                l.add(matrix[i][c1]);
            }
            c1--;

            if(r<=r1)
            for(int i=c1;i>=c;i--)
            {

                l.add(matrix[r1][i]);
            }
            r1--;
          if(c<=c1)
            for(int i=r1;i>=r;i--)
            {

                l.add(matrix[i][c]);
            }
            c++;

        }
      //  l.add(matrix[r1][c1]);
        return l;

    }
}
