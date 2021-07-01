package sortings;
public class first_and_last_position {

    public int[] searchRange(int[] nums, int target) {
        int a[]=new int[2]; int l=nums.length;
        
       
      /*  a[0]=-1;
        a[1]=-1;
        if(h==0) return a;
      for(int i=0;i<h;i++)
      {
          if(target==nums[i])
          {
             
                  if(i>0 && target==nums[i-1])
                  {
                      if(j==0){
                      a[0]=i-1;
                  a[1]=i;
                          j++;
                      }
                      else{
                          a[0]=Math.min(a[0],i-1);
                          a[1]=Math.max(a[1],i);
                      }
                   
              }
              else if(i<nums.length-1 && target==nums[i+1])
              {
                  if(j==0){
                      a[0]=i;
                  a[1]=i+1;
                          j++;
                      }
                      else{
                          a[0]=Math.min(a[0],i);
                          a[1]=Math.max(a[1],i+1);
                      }
                   
                  
              }
              else{
                 a[0]=i;
                  a[1 ]=i;
                  
              }
              
              }
              
              }
        return a;
          }*/ //brute force
          a[0]=-1;
          a[1]=-1;
         
          if(l==0) return a;
    int find=bs(nums,target,l,true); //O(log n)
          if(find==-1) return a;
          a[0]=find;
          a[1]=Math.max(find,bs(nums,target,l,false)); //O(log n)
         
          return a;
          
        }
        public int bs(int a[],int x,int n,boolean y) //O(log n)
    {
        int low=0,high=n-1,res=-1;
        while(low<=high)
        { int mid=(high+low)/2;
            if(a[mid]==x)
            {
                if(y) high=mid-1; //serach onleft of mid
             else low=mid+1; //search on right of mid
             res=mid;
             
            }
            else if(x<a[mid]) high=mid-1;
            else low=mid+1;
        }
        return res;
    }
}
//time->O(log n) and space O(1)