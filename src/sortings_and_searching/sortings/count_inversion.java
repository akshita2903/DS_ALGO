package sortings_and_searching.sortings;
//explanation->count of a[i]>a[j] in arrays
class count_inversion{
    static long inversionCount(long arr[], long N)
    {
        long temp[]=new long[arr.length];
        return ms(arr,temp,0,arr.length-1);
    }
    //Naive Approach
    /*long bubblesort(long a[],int n) {
        long ans=0L;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]) ans++;
            }
        }
        return ans;
        
    }*/
    //------------------------------------------------------------------------------------------------------//
    ///Better Approach
    static long ms(long a[],long t[],int lb,int ub){
        long ic=0L;
        if(lb<ub){
            int mid=lb+(ub-lb)/2;
            ic+=ms(a,t,lb,mid);
            ic+=ms(a,t,mid+1,ub);
            ic+=merge(a,t,lb,mid+1,ub);
        }
        return ic;
    }
    static long merge(long a[],long t[],int left,int mid,int right){
        int i=left,j=mid,k=left;
        long ic=0L;
        while((i<=mid-1) &&(j<=right)){
            if(a[i]<=a[j]){
                t[k]=a[i];
                //do nothing
                i++;
            }
            else{
               t[k]=a[j];
               j++;
               ic+=mid-i;
            }
            k++;
        }
        while(i<=mid-1) t[k++]=a[i++];
        while(j<=right){
            t[k++]=a[j++];
        }
        for(i=left;i<=right;i++) a[i]=t[i];
        return ic;
    }
}
//time->O(nlogn) space->O(n)