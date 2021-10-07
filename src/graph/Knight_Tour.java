package graph;
import java.util.*;
//a knight at position (x,y) can move only in (x+1,y-2),(x+1,y+2),(x-1,y-2),(x-1,y+2),
//(x+2,y-1),(x+2,y+1),(x-2,y+1),(x-2,y-1) in a chess board of dimension N X N,if postions mentioned lies in arnge 
// 1<=Pos(x)<=N && 1<=Pos(y)<=N
public class Knight_Tour {
    class Pair{
        int i,j;
        Pair(int x,int y)
        {
            i=x;
            j=y;
        }
    }
    //Function to find out minimum steps Knight needs to reach target position.
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
    {
        // Code here
        int[][] chess_board=new int[N][N]; //board size
        int src_x=KnightPos[0],src_y=KnightPos[1];
        int dest_x=TargetPos[0],dest_y=TargetPos[1];
        boolean[][] vis=new boolean[N+1][N+1];
        int[][] dist=new int[N+1][N+1];
        int[] x_d={-1,-1,-2,-2,1,1,2,2};
        int[] y_d={2,-2,1,-1,-2,2,1,-1};
      fill_max(dist,N); //fil didt array with max value
      dist[src_x][src_y]=0; //dist from src to src==0
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(src_x,src_y)); //aded iniatl pos of knight
        while(q.size()>0)
        {
            Pair p=q.poll();
            int x=p.i,y=p.j;
            if(x==dest_x && y==dest_y)
            {
                break;
            }
            vis[x][y]=true;
            for(int i=0;i<8;i++)
            {
              if(x+x_d[i]>=1 && x+x_d[i]<=N && y+y_d[i]<=N && y+y_d[i]>=1)
              {
                  int px=x+x_d[i];
                  int py=y+y_d[i];
                  if(!vis[px][py])
                  {
                      vis[px][py]=true; //amrk reachabe pos by knight as vis 
                      dist[px][py]=1+dist[x][y];//step from Pos(x,y) of knight to reachable pos(px,py)==1+steps require to reach pos(x,y)
                      q.add(new Pair(px,py));
                  }
              }
            }
        }
        return dist[dest_x][dest_y];
        
    }
    void fill_max(int[][] dist,int N)
    {
          for(int i=0;i<=N;i++)
          {
              for(int j=0;j<=N;j++)
        dist[i][j]=Integer.MAX_VALUE;
          }
    }
}
