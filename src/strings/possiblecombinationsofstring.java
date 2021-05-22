import java.util.*;
public class possiblecombinationsofstring{
  static  HashSet<String> ans=new HashSet<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
subsequence(s,s.length(),"");
        System.out.println(ans);
        sc.close();
    }
    public static void subsequence(String s,int m,String x)
    {

        if(m==0) {
            ans.add(x);
            return ;
        }
        subsequence(s.substring(1) ,m-1, x+s.charAt(0));
        subsequence(s.substring(1),m-1,x);

        //return s;

    }

}
