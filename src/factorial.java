import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<Integer> l=new ArrayList<>();
        l=factorial(n);
        System.out.println(l);
    }
    

static ArrayList<Integer> factorial(int N){
    //code here
    ArrayList<Integer> l=new ArrayList<>();
    int res[]=new int[100000];
    res[0]=1;
    int size=1;
    for(int i=2;i<=N;i++)
    size=resize(i,res,size);
    for(int i=size-1;i>=0;i--)l.add(res[i]);
    return l;
    
    
}
static int resize(int x,int a[],int s)
{
    int carry=0;
    for(int i=0;i<s;i++)
    {
        int p=(a[i]*x)+carry;
        a[i]=p%10;
        carry=p/10;
    }
    while(carry!=0)
    {
      a[s]=carry%10;
      carry/=10;
      s++;
    }
    return s;
}
}