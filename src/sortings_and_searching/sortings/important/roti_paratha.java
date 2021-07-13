package sortings_and_searching.sortings.important;

public class roti_paratha {
    //n->parathas,l->cooks,a[]=time taken by ith cook for 1 paratah
    static int bs(int a[],int l,int n){
        int ans=-1,low=0,high=100000000;
        while( low<=high){
            int mid=low+(high-low)/2;
            if(countans(mid,a,l,n)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    static boolean countans(int mid,int a[],int l,int n){
        int parathas=0;
       // System.out.println(mid);
        for(int i=0;i<l;i++){
            int z=2*mid/a[i];
           int c=-1+sqrt(1+(4*z));
           c/=2;
          // System.out.println(c+" paratsh");
           parathas+=c;
        }
        return (parathas>=n);
    } 
    static int sqrt(int val){
        return (int)(Math.sqrt(val));
    } 
}
