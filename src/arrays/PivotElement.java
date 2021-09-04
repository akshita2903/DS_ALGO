package arrays;
class PivotElement{
    public int findMin(int[] nums) {
        return founded(nums);
        
    }

int founded(int a[]){
    int l=0,h=a.length-1,n=a.length;
    
    
    if(a[l]<=a[h]) return a[l];
    while(l<=h){
      int m=l+(h-l)/2;
        if(a[m]>a[(m+1)%n]) return a[(m+1)%n];
     else   if(a[(m+n-1)%n]>a[m]) return a[m];
        else if(a[m]>=a[h]) l=m;
        else h=m;
    }
    return -1;
}
}
//time->O(log n) space->O(1)
//--> n-> size of array
