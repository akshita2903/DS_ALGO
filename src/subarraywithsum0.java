import java.util.*;
public class subarraywithsum0 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int a[]=new int[n];
      
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        System.out.println(findsum(a, n));
    }
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        HashSet<Integer> h=new HashSet<>();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum==0 || arr[i]==0|| h.contains(sum)) return true;
            h.add(sum);
            
            
        }
        return false;
    
}
    
}
