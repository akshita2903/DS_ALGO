package sortings_and_searching;
class Sqrt{
    int sqrt(int n){
        int s=0,end=n; int ans=0;
        while(s<=end){
            int mid=s+(end-s)/2;
            if((mid*mid)==n)
                return mid;
            else if((mid*mid)<n) {
                ans=mid;
                    s=mid+1;
                
            }
            else end=mid-1;
        }
        return ans;
    }
}