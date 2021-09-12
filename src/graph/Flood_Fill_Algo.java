package graph;
class Flood_Fill_Algo {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int[][] new_image=new int[image.length][image[0].length];
        int color=image[sr][sc];
        for(int i=0;i<image.length;i++)
        {
            for(int j=0;j<image[i].length;j++)
            {
                new_image[i][j]=image[i][j];
            }
        }
        fill(new_image,sr,sc,image.length,image[0].length,image,color,newColor);
        return new_image;
    }
    void fill(int[][] new_image,int i,int j,int m,int n,int[][] image,int color,int new_color)
    {
        if(i<0 || j<0 ||i>=m||j>=n || image[i][j]!=color || new_image[i][j]==new_color)
        {
            return ;
        }
        new_image[i][j]=new_color;
        fill(new_image,i-1,j,m,n,image,color,new_color); //north
        fill(new_image,i,j+1,m,n,image,color,new_color); //east
        fill(new_image,i,j-1,m,n,image,color,new_color);//west
        fill(new_image,i+1,j,m,n,image,color,new_color); //south
    }
}
