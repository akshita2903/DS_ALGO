package arrays;
import java.util.*;

public class doublehelix {
    
    Scanner sc=new Scanner(System.in);
  int i(){
        return (sc.nextInt());
    }
    int [] input(int n){
        int a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        return a;
    }
  void  solve(){
    while(true){
        int n=i();
        if(n==0) break; 
     int a[]=input(n);
     int m=i();
     int b[]=input(m);
     int i=0,j=0,sum1=0,sum2=0,res=0;
     while(i<n || j<m){
         if(i<n && j<m && a[i]<b[j]){
             sum1+=a[i];i++;
         }
         else if(i<n && j<m && b[j]<a[i]){
             sum2+=b[j];
             j++;
         }
         else if(i<n && j<m && a[i]==b[j]){
             res+=a[i];
             res+=Math.max(sum1,sum2);
             sum1=0;
             sum2=0;
             i++;
             j++;
         }
         else if(j==m && i<n) sum1+=a[i++];
         else if(i==n && j<m) sum2+=b[j++];
         
     }
     res+=Math.max(sum1,sum2);
     System.out.println(res);
    }
    
}
}
