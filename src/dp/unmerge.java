package dp;
import java.io.*;
import java.util.*; 
import java.lang.*;
import java.text.*;

 
public class unmerge   //JAVA FORMAT
{
 final static int n=1000000;
 static boolean b[]=new boolean[n+2];
 static  FastReader sc=new FastReader();
   
    public static void solve()
    {
int t=i();
while(t-->0)
{
   
 int n=i();
 int a[]=input(2*n);
 int size[]=new int[2*n]; int j=0,x=0;
 size[j]=1;
 for(int i=1;i<(2*n);i++){
    if(a[i]<a[x]) size[j]+=1;
    else{
     //   System.out.println(size[j]+"aww");
       // System.out.println(a[i]+"xyz");
        x=i; j++;
        size[j]=1;
    }
    }
 System.out.println((issum(n,size,j))?"YES":"NO");
 
 }
    }
    public static boolean issum(int sum,int a[],int n){
        boolean dp[][]=new boolean[sum+1][n+1];
        for(int i=0;i<=sum;i++){
            for(int j=0;j<=n;j++){
                if(i==0) dp[i][j]=true; //sum=1 means size of subarray=1
                else if(j==0) dp[i][j]=false; //empty set
                else if(a[j-1]<=i)
                dp[i][j]=((dp[i-a[j-1]][j-1])||(dp[i][j-1]));
                else dp[i][j]=dp[i][j-1];
            }
        }
        return dp[sum][n];
    }
   
 
   
  // System.out.println(max_a);
  //System.out.println(String.format("%.7f",max_a));
   

        
        
     public static void main(String[] args) 
    { 
       
 solve();
    }
  
  /*  public static int diglen(Long y)
    {int a=0;
        while(y!=0L)
        {
         y/=10;
         a++;
          
        }
        return a;
    }
     public static boolean ispalchar(char c[],int n)
     {
         for(int i=0;i<n;i++)
         {
             if((c[i]!=c[n-i-1]) || c[i]=='?') return false;
         }
         return true;
     }*/
       
    
        public static int i()
        {
            int s=sc.nextInt();
            return s;
        }
        public static Long l()
        {
            Long k=sc.nextLong();
            return k;
        }
  
        public static int gcd(int a,int b)
        {  
            if(a==0) return b;
            if(b==0) return a;
            if(a>b)
            return gcd(b,a%b);
            return gcd(b%a,a);
        }
        
      public static int [] input(int n)
      {
          int a[]=new int[n];
          for(int i=0;i<n;i++) a[i]=sc.nextInt();
          return a;
      }
        public static Long [] inpuut(int n)
      {
          Long a[]=new Long[n];
          for(int i=0;i<n;i++) a[i]=sc.nextLong();
          return a;
      }
      public static  int sum(int a[],int n){
          int s=0;
      for(int i=0;i<n;i++) s+=a[i];
      return s;
      }
       public static  Long suml(Long a[],int n){
          Long s=0L;
      for(int i=0;i<n;i++) s+=a[i];
      return s;
      }
        public static void sieve()
        {
            b[0]=true; b[1]=true;
            for(int i=2;i*i<=n;i++)
            {
                if(!b[i])
                for(int j=i*i;j<=n;j+=i)
                {
                    b[i]=true;
                }
            }
        }
          static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
 
            
              
    } 
//Time complexity->O(sum*n) and space complexity O(sum*n)
