class aggressive_cows{
  import java.io.*;
import java.util.*; 
import java.lang.*;
import java.text.*;

 
public class Main  //JAVA FORMAT
{
 final static int n=1000000;
 static boolean b[]=new boolean[n+2];
 static  FastReader sc=new FastReader();
   Long mod=1000000007L;
    public static void solve()
    {
     
     int t=i();
     while(t-->0){
         int n=i();
         int cows=i();
         Long stall[]=inpuut(n);
         Arrays.sort(stall);
         System.out.println(bs_for_cow(stall, n, cows));
     }
 }
 static long bs_for_cow(Long st[],int n,int cow){
     Long ans=-1L;
     Long low=0L,high=st[n-1]-st[0];
     while(low<=high){
         Long mid=(low)+(high-low)/2;
         if(isvalid(st,n,mid,cow)){
             ans=mid;
             low=mid+1;
         }
         else high=mid-1;
     }
     return ans;
 }
 static boolean isvalid(Long a[],int n,Long mid,int c){
     Long ps=a[0];
     int count=1;
     for(int i=1;i<n;i++){
         Long diff=a[i]-ps;
         if(diff>=mid){
             count++;
             if(count>=c) return true;
             else ps=a[i];
         }
     }
 return false;
 }
    
    static int[] fillevel(ArrayList<ArrayList<Integer>> l1,int n,int x){
        int level[]=new int[n+1];
boolean visited[]=new boolean[n+1];
level[x]=0; visited[x]=true;
Queue<Integer> q=new LinkedList<>();
q.add(x);
while(q.size()>0){
    x=q.peek();
    q.remove();
    for(int j=0;j<l1.get(x).size();j++){
        int y=l1.get(x).get(j);
        if(!visited[y]){
            visited[y]=true;
            level[y]=level[x]+1;
            q.add(y);
        }
    }
}
        return level;
    }

    static char ch(String s,int i){
        return s.charAt(i);
    }
   static int len(String s){
        return s.length();
    }
  static  int max(int x,int y){
        return (x>y)?x:y;
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
 
            
              
    } //spoj
}
