package sortings_and_searching;
import java.util.*;
 class kth_elemnt {
    static Scanner s=new Scanner(System.in);
    public static void main(String args[] ) throws Exception {
       
        int t=i();
        while(t-->0){
            solve();
        }
       
    }
    
    static void solve(){
        int n=i();
        int q=i();
        Long a[][]=new Long[n][2];
       
        for(int i=0;i<n;i++){
           a[i][0]=L();
           a[i][1]=L();
        }
        Long b[][]=merge(a);
        while(q-->0){
            Long k=L();
            boolean found=false; Long ans=-1L;
            for(int i=0;i<b.length;i++){
               Long diff=Math.abs(b[i][0]-b[i][1])+1;
               if(k<=diff){
                   ans=b[i][0]+k-1;
                   found=true;
                   System.out.println(ans);
                   break;
               }
               else k=k-diff;

                }
                if(found==false) System.out.println(-1);
            }
            
        }
  

     public static Long[][] merge(Long[][] intervals) {
        int m =intervals.length;
        Long a[][]=new Long[m][2];//O(m)->space
        int i=0,j=0;
        Long s[]=new Long[m]; //O(m) =>space
        Long e[]=new Long[m]; //O(m)
        for(i=0;i<m;i++) //O(m) ->time
        {
            s[i]=intervals[i][0];
            e[i]=intervals[i][1];
        }
        Arrays.sort(s); Arrays.sort(e); //O(mlogm)
    for(i=0;i<m;i++) a[i][1]=-1L; //o(m)
        i=0;
        
        a[0][0]=s[0];
        a[0][1]=e[0];
        for(j=1;j<m;j++) //O(m)
        {
            if(s[j]<=e[j-1])
            {
             
                   if(a[i][1]>=s[j])  a[i][1]=e[j];
                else{
                    i++;
                    a[i][0]=s[j-1];
                    a[i][1]=e[j];
                }
                
                }
            else{
                if(a[i][1]>=s[j]) a[i][1]=e[j];
                else{
                    i++;
                    a[i][0]=s[j];
                    a[i][1]=e[j];
                }
            }
            }
        Long ans[][]=new Long[i+1][2]; //O(I)->space
        for(j=0;j<=i;j++){
            ans[j][0]=a[j][0];
            ans[j][1]=a[j][1];
        }
        return ans;
        
    }
    static int i(){
        int x=s.nextInt();
        return x;
    }
    static Long L(){
        Long y=s.nextLong();
        return y;
    }
    
}


//comprise of merge interval and dimaag
//time->O(n*q)+O(nlogn) sapce->O(2*n)