package sortings_and_searching.sortings.important;
import java.util.*;
//------------QUESTION EXPLANATION-------------------------------//
/*
Input:
N = 4
A[] = {12,34,67,90}
M = 2
Output:
113
Explanation: 
Allocation can be done in following ways:
{12} and {34, 67, 90} Maximum Pages = 191
{12, 34} and {67, 90} Maximum Pages = 157
{12, 34, 67} and {90}  Maximum Pages =113
Therefore, the minimum of these cases is 
113, which is selected as the output.
3 condtn->1-Atleast 1 book to each student
2-cntinuguous distribution
3-can.t divide pages of a particular book*/ 

public class Allocate_minimum_number_of_pages {
     //Function to find minimum number of pages.
     public static int findPages(int[]a,int n,int m)
     {
         //Your code here
        if(m>n) return -1; //if students>total books
         return allocate(a,n,m);
     }
     static int allocate(int books[],int n,int stud){
     
         int low=0,high=0,ans=-1;
         for(int i=0;i<n;i++){ //o(N)
             high+=books[i];
             low=Math.max(low,books[i]);
         }
        //o(log(n))
         while(low<=high){
             int mid=low+(high-low)/2;
             if(isvalid_allocation(mid,books,n,stud)) //O(n)
             {
                 ans=mid;
                 high=mid-1;
                 
             }
             else low=mid+1;
            
         }
         return ans;
     }
  static   boolean isvalid_allocation(int max_pages,int books[],int n,int stud){
         int student=1,sum=books[0]; //important
         for(int i=1;i<n;i++){ //O(N)
 
             sum+=books[i];
             if(sum>max_pages)
             {
                 student++;
                 sum=books[i];
             
             }
             if(student>stud) return false;
             
            
         }
         return true;
     }
    
}

//time->O(nlogn) and space->O(1)
