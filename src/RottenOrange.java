import java.util.*;
/*
Q:You are given an m x n grid where each cell can have one of three values:

0 representing an empty cell,
1 representing a fresh orange, or
2 representing a rotten orange.
Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.

Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.

Ex-1
Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
Output: 4

Ex-2
Input: grid = [[2,1,1],[0,1,1],[1,0,1]]
Output: -1
Explanation: The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directionally.



*/
class RottenOrange{
    public int orangesRotting(int[][] grid) {
        
        int row=grid.length,col=grid[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]==2)
                {
                dfs(grid,i,j,2);

                }
               // minutes=max(minutes,grid[i][j]);
            }
        }
        //check if no fresh oranges are present
        int minutes=isAllRotten(grid);
        return minutes;
        
    }
  int isAllRotten(int[][] grid)
    {
      int minutes=2;
      for(int[] row:grid)
        {
            for(int col:row)
            {
                if(col==1) return -1;
                minutes=max(minutes,col);
            }
        }
        return minutes-2;
    }
    void dfs(int[][] grid,int i,int j,int minutes)
    {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0)
        {
            return ;
        }
        //if grid[i][j]==2(rotten orange) it will result in wrong answer
        if(1<grid[i][j] && grid[i][j]<minutes) return ;
       // System.out.println("i :"+i+" j :"+j+" min: "+minutes);
        grid[i][j]=minutes;
        //left
        dfs(grid,i,j-1,minutes+1);
        //right
        dfs(grid,i,j+1,minutes+1);
        //up
        dfs(grid,i-1,j,minutes+1);
        //down
        dfs(grid,i+1,j,minutes+1);
        
    }
    int max(int a,int b)
    {
        return a>=b?a:b;
    }
}
