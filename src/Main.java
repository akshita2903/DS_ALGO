import java.io.*;
import java.util.*;

import javax.swing.plaf.synth.SynthToolTipUI;

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
int k=i();
Long[] a=inpuut(n);
HashMap<Long,Integer> mp=new HashMap<>();
for(int i=0;i<n;i++)
mp.put(a[i],i);
Arrays.sort(a);
int ans=1;
for(int i=1;i<n;i++){
    int x=mp.get(a[i]),y=mp.get(a[i-1]);
    if((y+1)!=x) ans++;

}
System.out.println((ans<=k)?"Yes":"No");
    }
    }
         
     static int min(int a,int b) {
         return (a<=b)?a:b;
     }


     static void print(int a[]){
         for(int i:a)
         System.out.print(i+" ");
         System.out.println();
     }
 

 
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
     return (int)Math.sqrt(val);
 }
 static int[] sort(int a[]){
     Arrays.sort(a);
     return a;
 }
 static boolean isvalid(Long a[],int n,Long mid,Long c){
     
     Long sum=0L;
     for(int i=0;i<n;i++){
         if(a[i]>mid)
        sum+=(a[i]-mid);
         }
     if(sum>=c) return true;
 return false;
 }
 static int calc(){
     return 0;
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
   

        
 //-----------------------------------------------------------------------------------//       
     public static void main(String[] args) 
    { 
       
 solve();
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