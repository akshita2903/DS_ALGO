/**
 * max_min_element
 */
import java.util.*;
public class max_min_element {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)a[i]=sc.nextInt();
     min_max(a,n); 
     sc.close(); 
   }
   static void min_max(int a[],int n)
   {
    int min=a[0],max=a[0];
       //1-method
     /*  
       for(int i=1;i<n;i++)
       {
           if(a[i]>max) max=a[i];
         else  if(a[i]<min) min=a[i];
       }
      
       T.C=O(n), comparison=1+2(n-1)-for worst Case(array in desending order)
       1+n-2 ->for best case (array in ascending order)
                      */
       //2nd method-------
       int i=1;
       while(i<n-1)
       {
           if(a[i]<a[i+1])
           {
               if(a[i+1]>max) max=a[i+1];
               if(a[i]<min) min=a[i];

           }
           else if(a[i]>a[i+1])
           {
               if(a[i]>max) max=a[i];
               if(a[i+1]<min) min=a[i+1];
           }
           i+=2;
       }
       System.out.println("Minimum element ="+min);
       System.out.println("Maximum element ="+max);
       //T.C=O(n),comparisons-> 3n/2 for best,4n/2 for worst

       

   } 

    
}