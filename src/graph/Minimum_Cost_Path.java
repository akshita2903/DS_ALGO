package graph;
class Minimum_Cost_Path{
  class Pair{
       int indx_i,indx_j,c;
       Pair(int i,int j,int c1){
           indx_i=i;
           indx_j=j;
           c=c1;
       }
   }
   
    public int minimumCostPath(int[][] grid)
    {
     
    int n=grid.length,cost=0;
    PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.c-b.c);
    pq.add(new Pair(0,0,grid[0][0]));
    while(pq.size()>0)
    {
        Pair vis=pq.poll();
      int x=vis.indx_i,y=vis.indx_j;
        cost=vis.c;
      if(x==n-1 && y==n-1) break;
      if(grid[x][y]==-1) continue;
      grid[x][y]=-1;
      if(x-1>=0){
          if(grid[x-1][y]!=-1) pq.add(new Pair(x-1,y,cost+grid[x-1][y]));
      }
       if(y-1>=0){
          if(grid[x][y-1]!=-1) pq.add(new Pair(x,y-1,cost+grid[x][y-1]));
      }
      if(y+1<n)
      {
          if(grid[x][y+1]!=-1)
          pq.add(new Pair(x,y+1,cost+grid[x][y+1]));
      }
      if(x+1<n)
      {
          if(grid[x+1][y]!=-1)
          pq.add(new Pair(x+1,y,cost+grid[x+1][y]));
      }
     
    
    }
     return cost; 
    }
}
