package graph;
class number_of_island{
    public int numIslands(char[][] grid)
    {
    int m=grid.length,n=grid[0].length;
    boolean[][] vis=new boolean[m][n];
    int count=0;
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++)
        {
            if(vis[i][j]==false && grid[i][j]=='1')
            {
                count++;
                get_surrounded_area(grid,i,j,vis,m,n);
            }
        }
    }
    return count;
    }
    void get_surrounded_area(char[][] grid,int i,int j,boolean[][] vis,int m,int n){
        if(i<0 || j<0 ||i>=m||j>=n||vis[i][j]==true||grid[i][j]=='0')
        {
            return ;
        }
        vis[i][j]=true;
        get_surrounded_area(grid,i-1,j+1,vis,m,n);//diagonal
        get_surrounded_area(grid,i+1,j-1,vis,m,n);//diagonal
        get_surrounded_area(grid,i-1,j-1,vis,m,n);//diagonal
        get_surrounded_area(grid,i+1,j+1,vis,m,n); //diagonal
        get_surrounded_area(grid,i-1,j,vis,m,n); //north
        get_surrounded_area(grid,i,j+1,vis,m,n); //east
        get_surrounded_area(grid,i,j-1,vis,m,n);//west
        get_surrounded_area(grid,i+1,j,vis,m,n); //south
    }
}