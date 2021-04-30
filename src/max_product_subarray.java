import java.util.*;
public class max_product_subarray {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
   
    int a[]=new int[n];
   
    for(int i=0;i<n;i++)a[i]=sc.nextInt();
    System.out.println(maxProduct(a,n));
    
}
static long maxProduct(int[] arr, int n) {
    // code here
    long max_prod_sofar=1,max_prod=1;;
    for(int i=0;i<n;i++)
    {
    max_prod_sofar*=arr[i];
    if(max_prod_sofar>max_prod) max_prod=max_prod_sofar;
    if(max_prod_sofar==0) max_prod_sofar=1;
    }
    max_prod_sofar=1;
    for(int i=n-1;i>=0;i--)
    {
       max_prod_sofar*=arr[i];
       if(max_prod_sofar>max_prod) max_prod=max_prod_sofar;
       if(max_prod_sofar==0) max_prod_sofar=1;
    }
    return max_prod;
}
}
