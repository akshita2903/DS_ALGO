package BackTracking;

public class SudokuSolver {
    public static void main(String[] args) {
        
        int[][] grid={
            {3 0 6 5 0 8 4 0 0},
            {5 2 0 0 0 0 0 0 0},
            {0 8 7 0 0 0 0 3 1 },
            {0 0 3 0 1 0 0 8 0},
            {9 0 0 8 6 3 0 0 5},
            {0 5 0 0 9 0 6 0 0},
            {1 3 0 0 0 0 2 5 0},
            {0 0 0 0 0 0 0 7 4},
            {0 0 5 2 0 6 3 0 0}}
            SolveSudoku(grid);
    }
        //Function to find a solved Sudoku. 
        static boolean SolveSudoku(int grid[][])
        {
          solve(grid);
          return true;
        }
        static  boolean solve(int[][] a){
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    if(a[i][j]==0){
                        for(int num=1;num<=9;num++){
                            if(isSafe(a,i,j,num)){
                                a[i][j]=num;
                                if(solve(a))
                                {
                                    return true;
                                }
                               else a[i][j]=0;
                            }
                        
                        }
                        return false;
                    }
                }
            }
            return true;
        }
        static boolean isSafe(int[][] a,int row,int col,int num){
            //chk if num ha been already placd in that row or clumn ,if yes return false
            for(int i=0;i<9;i++){
                if( a[i][col]==num || a[row][i]==num) return false;
            }
            
            int sqrt=(int)(Math.sqrt(a.length));
            //get starting indx(row) of square whose part is row,col
            int srow=row-(row%sqrt);
            //get starting indx(col) of square whose part is row,col
            int scol=col-(col%sqrt);
            for(int i=srow;i<srow+sqrt && i<a.length;i++)
            {
                for(int j=scol;j<scol+sqrt && j<a[0].length;j++)
                {
                    if(a[i][j]==num) return false;
                }
            }
            return true;
        }
        
        //Function to print grids of the Sudoku.
        static void printGrid (int grid[][])
        {
            // add your code here
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    System.out.print(grid[i][j]+" ");
                }
            
            }
            System.out.println();
        }
}

//time-> O(9^(n*n)). 
// space->O(1) as only input array is used