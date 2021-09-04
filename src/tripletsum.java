import java.util.*;
public class tripletsum {
    public static boolean find3Numbers(int A[], int n, int X) { 
    
        // Your code Here
        Arrays.sort(A);
        for(int i=0;i<n-2;i++) //O(n)
        {
            if(issum(A,i+1,n-1,X,A[i])) return true; //O(n)
        }
     return false;
     }
     static boolean issum(int a[],int s,int e,int sum,int y)
     {
        while(s<e) //O(n)
        {
            if(a[s]+a[e]+y==sum) return true;
            else if(a[s]+a[e]+y<sum) s++;
            else e--;
        }
        return false;
     }
    
}
//T.c->O(n2) and space->(O(1))
