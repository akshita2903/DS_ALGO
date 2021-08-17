class find_in_Mountain{
   public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak=peak_index(mountainArr);
        //serach for first half
        int ans=bs(mountainArr,0,peak,target,true);
        if(ans==-1) //chk for second half if in first half ans nnot found
    ans= bs(mountainArr,peak+1,mountainArr.length()-1,target,false);
        return ans;
    }
    //find peak element
    //serach in from 0 to pek index
    int bs(MountainArray a,int s,int e,int target,boolean f)//f==true for ascending and f=false for descending
    {
        while(s<=e){
            int mid=s+(e-s)/2;
              int mid_ele=a.get(mid);
            if(f)
            {
              
              if(mid_ele>target) e=mid-1;
                if(mid_ele<target) s=mid+1;
                if(mid_ele==target) return mid;
            }
            else{
               if(mid_ele>target) s=mid+1;
                 if(mid_ele<target) e=mid-1;
                 if(mid_ele==target) return mid;
            }
        }
        return -1;
    }
        
    //if not found the search from peak to lenght
    //finding peak
    int peak_index(MountainArray ma){
        int s=0,e=ma.length()-1,n=ma.length();
        while(s<e){
            int mid=s+(e-s)/2;
            if(mid+1<n && ma.get(mid)>ma.get(mid+1)){
              e=mid;  
            }
            else s=mid+1;
        }
        return s;
    }
}
