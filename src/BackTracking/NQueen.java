package BackTracking;
import java.util.*;
public class NQueen {
    public static void main() {
      Scanner sc=new Scanner(System.in);
      
      int n=sc.nextInt();
      ArrayList<ArrayList<Integer>> ways=  nQueen(n);
      print(ways);
    }
    static void print( ArrayList<ArrayList<Integer>> ways){
        for(int i=0;i<ways.size();i++){
            System.out.println(i+1 + "Way is to put Queen in ");
            for(int j=0;j<ways.get(i).size();j++){
                System.out.print(j+" "+"column of "+j+"th row");
            }
        }
    }
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        boolean[][] vis=new boolean[n][n];
        nQ(n,0,ans,new ArrayList<Integer>(),vis);
        return ans;
    }
    static void nQ(int n,int st,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> temp,boolean[][] vis)
{
    if(st==n){
        add(ans,temp);
    }
    for(int col=0;col<n;col++){
        if(isSafe(st,col,vis)){
            vis[st][col]=true;
            temp.add(col+1);
            nQ(n,st+1,ans,temp,vis);
            vis[st][col]=false;
            temp.remove(temp.size()-1);
        }
    }
    
}
static boolean isSafe(int row,int col,boolean[][] vis){
    if(row==0) return true;
    for(int i=0;i<=row;i++){
        if(vis[i][col]) return false;
    }
    //for left diagonal
    int ld=Math.min(row,col);
    for(int i=1;i<=ld;i++){
        if(vis[row-i][col-i]) return false;
    }
    //for right diagonal
    int n=vis.length;
    int rd=Math.min(n-col-1,row);
    for(int i=1;i<=rd;i++){
        if(vis[row-i][col+i]) return false;
    }
    
    return true;
}
static void add(ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> temp){
    if(ans.size()==0 || ans.contains(temp)==false) ans.add(new ArrayList<>(temp));
}
    
}
//t.c ->O(n!) ans O(n*n) and space->O(n*n)
