package Bits_Manipulations;

public class count_Set_bits {
    public int[] countBits(int n) {
        return counting(n);
         
     }
     int [] cb(int n){
         int a[]=new int[n+1];
         a[0]=0;
         for(int i=1;i<=n;i++) a[i]=bits(i);
         return a;
     } //O(nlogn) logn for counting set bits and n for traversing 1 to n
     int bits(int x){
         int ans=0;
         while(x!=0){
             ans++;
             x=(x&(x-1));
         }
         return ans;
     }

     
     
     /*-----BETTER*/
     int [] counting(int n){
        int ans[]=new int[n+1];
         for(int i=1;i<=n;i++) ans[i]=ans[(i>>1)]+(i%2);
         return ans;
     } //O(n) only traversing
    
}
//SPACE->BOTH O(N) FOR ARRAY STRING ANSWERS OF EACH I
