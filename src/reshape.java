class reshape{
  public int[][] matrixReshape(int[][] mat, int r, int c) {
      int m=mat.length,n=mat[0].length;
      if((r*c)!=(m*n)) return mat;
      else {
              int res[][]=new int[r][c];

        int a[]=new int[m*n];
        fillarray(mat,m,n,a);
        return reshape(a,r,c,res);
        
      }
        
    }
  int[][] reshape(int a[],int r,int c,int res[][]){
    int p=0;
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++)
        res[i][j]=a[p++];
      }
    return res;
    
  }
  void fillarray(int mat[][],int m,int n,int a[]){
    int p=0;
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++)
        a[p++]=mat[i][j];
    }
  }





















}
