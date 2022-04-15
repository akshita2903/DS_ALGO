/*
given a row wise sorted matrix of size RxC where R and C are always odd, find the median of the matrix.
Input:
R = 3, C = 3
M = [[1, 3, 5], 
     [2, 6, 9], 
     [3, 6, 9]]

Output: 5

Explanation:
Sorting matrix elements gives us 
{1,2,3,3,5,6,6,9,9}. Hence, 5 is median.
*/
package sortings_and_searching
class Matrix_Median{
 int median(int a[][], int r, int c) {
        // code here    
        int ans=FindMedian(a,r,c);
        return ans;
    }
    int FindMedian(int[][] a,int row,int cols){
        int median_indx=(row*cols)/2;
       // System.out.println(median_indx);
        int low=1,high=2000;
        while(low<=high){//Olog(2^32)
            int expected_median=low+(high-low)/2;
            int count=0;
            for(int i=0;i<row;i++){    //O(total_row)
                count+=ElementsLessThanEqualTo_expected_median(a,i,0,cols-1,expected_median);  //O(log(total_col))
            }
          //   System.out.println(expected_median+" Ex "+count+" b "+low+" knh "+high);
            if(count<=median_indx)//Real median lies between expected_median to high
          {
              low=expected_median+1;
          }  
          else{
              high=expected_median-1;
          }
         
       
        }return low;
        
       
    }
    int ElementsLessThanEqualTo_expected_median(int[][] a,int row,int low,int high,int expected_median){
     while(low<=high){
         int mid=low+(high-low)/2;
         int value=a[row][mid];

      
         if(value<=expected_median){
             low=mid+1;
         }
         else high=mid-1;
     } 
     return low;
     //t.c O(log(high)) high=total_columns
    }
    
    //TimeComplexity=O(log (@^32) *total_row*log(total_col))=O(32 *R*log(C)) log-base 2
  
}
