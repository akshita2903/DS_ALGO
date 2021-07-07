package Bits_Manipulations;

public class count_bits_in_1_to_N {
    public static int countSetBits(int n){
        return counting(n); 
      
      }
      public static int counting(int n){
           if(n==0)return 0; //0->00000000000000(no et bit)
          int x=highest_power_of_two(n); //<=n
          int y=bits_in_hpt(x); //total bits in binary of x
          int ans=((x>>1)*(y-1))+(n-x+1)+countSetBits(n-x);
          return ans;
      }
      private static int highest_power_of_two(int n)
      {
          int x=1;
          while(x<n){
              x=(x<<1);
          }
          if(x>n) x=(x>>1);
          return x;
      }
      private static int bits_in_hpt(int n){
          int y=(int)(Math.log(n)/Math.log(2)+1);
          return y;
      }
    
}
//time-> O(log(N)); space0->O(1) other than stack