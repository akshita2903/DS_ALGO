package dp;

public class friendpairing_prob {

    long mod=1000000007;
    long ans=0L;
    public long countFriendsPairings(int n)
    {
     return cfp(n);

    }
   public long cfp(int n)
{
//  long dp[]=new long[n+1];
//  for(int i=1;i<=n;i++)
//  {
//      if(i<=2) dp[i]=i;
//      else dp[i]=((dp[i-1]%mod)+((i-1)*dp[i-2])%mod)%mod;
//  }
//  return dp[n]; ->time->O(n) and space->O(n)
long a=0L,b=0L,c=0L;
if(n<=2) return (n%mod);
a++;
b++;
b+=a;
for(int i=3;i<=n;i++)
{
  c=((((i-1)*a)%mod )+ (b%mod))%mod; //using fibonacci
  a=b;
  b=c;
}
return c;  //time->O(n) and space->O(1)


}
}
