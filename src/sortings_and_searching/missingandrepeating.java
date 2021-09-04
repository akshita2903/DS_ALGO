package sortings_and_searching;
import java.io.*;
import java.util.*;
public class missingandrepeating {
    // Initial Template for Java


    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
    int xor=0,x=0,y=0;
    for(int i=0;i<n;i++) {
        xor^=arr[i];
        xor^=(i+1);
    } //x^y=xor
    int set_bit=xor & (~(xor-1));
    for(int i=0;i<n;i++)
    {
        if((arr[i]& set_bit)!=0) x^=arr[i];
        else y^=arr[i];
        if(((i+1) &set_bit)!=0) x^=(i+1);
        else y^=(i+1);
    } int z=0;
    int a[]=new int[2];
   for(int i=0;i<n;i++){
       if(y!=arr[i])z++;
   }
   if(z==n) {
       a[0]=x;
       a[1]=y;
   }
   else{
       a[1]=x;
       a[0]=y;
   }
    return a;


    }
}


