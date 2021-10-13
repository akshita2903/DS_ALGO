package dp;
import java.util.*;
/*
Ques:-Given strings A, B, and C, find whether C is formed by an interleaving of A and B.
An interleaving of two strings S and T is a configuration such that it creates a new string Y from the concatenation substrings of A and B and |Y| = |A + B| = |C|
For example:
A = "XYZ"
B = "ABC"
so we can make multiple interleaving string Y like, XYZABC, XAYBCZ, AXBYZC, XYAZBC and many more so here your task is to check whether you can create a string Y which can be equal to C.
EXAMPLE:I/P :A = YX, B = X, C = XXY output-false
I/P :A = XY, B = X, C = XXY  output=true;
*/
class Interleaved_String{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String a=sc.next(); String b=sc.next(); String c=sc.next();
    System.out.println("String"+c+"interleave of"+a+" "+b+"T/F->"+isInterLeave(a,b,c));
  }
  	public static boolean isInterLeave(String a,String b,String c)
	{
    int m=a.length(),n=b.length();
boolean[][] dp=new boolean[m+1][n+1];
if(c.length()!=(m+n)) return false;
for(int i=0;i<=m;i++)
{
    for(int j=0;j<=n;j++)
    {
        if(i==0 && j==0) //a string is empty and b is also e mpty
        dp[i][j]=true;
        else if(i==0 && j!=0) //a is empty while b is not empty
        {
        if(getc(c,j-1)==getc(b,j-1))
        dp[i][j]=dp[i][j-1] ; //go for next len
        }
        else if(j==0 && i!=0)//b is empty a is not
        {
            if(getc(a,i-1)==getc(c,i-1))
            dp[i][j]=dp[i-1][j];
        }
        else // none of the string is empty
        {
            int len=i+j-1;
            if(getc(c,len)==getc(a,i-1) && getc(c,len)!=getc(b,j-1))
            dp[i][j]=dp[i-1][j];
            else if(getc(c,len)==getc(b,j-1) && getc(c,len)!=getc(a,i-1))
            dp[i][j]=dp[i][j-1];
            else if(getc(c,len)==getc(a,i-1) && getc(c,len)==getc(b,j-1))
            dp[i][j]=(dp[i][j-1] || dp[i-1][j]);
        }
    }
}
return dp[m][n];
   
	}
	char getc(String x,int i)
	{
	    return x.charAt(i);
	}
}
