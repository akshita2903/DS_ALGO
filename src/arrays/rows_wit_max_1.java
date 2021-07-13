package arrays;
class rows_wit_max_1{
    int rowWithMax1s(int arr[][], int n, int m) {
    return better(arr,n,m);
    }
 //NAIVE APPROACH: run two loops and find number of 1's in each ow and return row with max 1.Time->O(n*m) 
  //------------------------------------------------------------------------------------------------------------------------------//
  //Better APPROACH of time complexity->O(n*logm).since matrix is sorted find first index of 1 in row using Binary Search
  //and subtract it from no.of col to obtain total 1's in each row
 
    int better(int a[][],int n,int m){
        int ans=-1,max=0,li=-1,fi=-1;;
        for(int i=0;i<n;i++){
            li=-1; fi=-1;
            fi=bs(a,i,0,m-1,1);
          if(fi!=-1) li=bs(a,i,fi,m-1,0);
          int sum=(li!=-1 && fi!=-1)?(li-fi)+1:(fi!=-1)?1:-1;
          if(max<sum){
              max=sum;
             
              ans=i;        
             
          }
         
        }
        return ans;
    }
    int bs(int a[][],int r,int l,int h,int f){
        int max=-1,min=h+3,found=0;
        while(l<=h){
            int m=l+(h-l)/2;
            if(a[r][m]==1){
                if(f==1) {min=Math.min(min,m);
                found=1;
                h--;
                }
                else {max=Math.max(max,m);
                l++;
                }
            }
            else l++;
        }
        return (f==1)?((found==0)?-1:min):max;
    }
  //----------------------------------------------------------------------------------------------------------------------------------------//
  //BEST APPROACH of time->O(n+m) find no.odf one,s in first row and chl for each row if a[row][index where leftmost 1 of row 0 was present -1] is one then that row is out answer and 
  //do same for all rows
   int best(int a[][],int n,int m){
        int ans=-1,j=m,sum=0;
       
          for(int i=0;i<n;i++){
              while(j>0 && a[i][j-1]==1){
                  ans=i;
                  j--;
              }
          }
          return ans;
           }
  
  
  
  
  
}
