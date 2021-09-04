package heap;
import java.util.*;
public class array_to_min_and_max_heap {
   

    static  Scanner s=new Scanner(System.in);
    public static void main(String str[]){
       
        int n=i();
        int a[]=input(n);
      
        System.out.println("original Array");
        print(a,n);
        System.out.println("Min_Heapify");
      heap(a,n,true);
        print(a,n);
        System.out.println("MAX_HEAP");
        heap(a,n,false);
        print(a,n);
        
        
    }
   static void heap(int a[],int n ,boolean f){
       for(int i=(n-2)/2;i>=0;i--)
       heapify(a,i,n,f);
   }
   static void heapify(int a[],int parent,int n,boolean heap){
       int lc=(2*parent)+1,rc=(2*parent)+2,l=parent;
       if(heap){
           if(lc<n && a[lc]<a[l]) l=lc;
           if(rc<n && a[rc]<a[l]) l=rc;
           if(l!=parent){
               swap(parent,l,a);
               heapify(a,l,n,heap);
           }
           else return ;
       }
       else{
          if(lc<n && a[lc]>a[l]) l=lc;
           if(rc<n && a[rc]>a[l]) l=rc;
           if(l!=parent){
               swap(parent,l,a);
               heapify(a,l,n,heap);
           }
           else return ;  
       }
   }
   static void swap(int x,int y,int a[]){
       int t=a[x];
       a[x]=a[y];
       a[y]=t;
   }
 static   void print(int p[],int n){
        for(int i=0;i<n;i++)
        System.out.print(p[i]+" ");
        System.out.println();
    }
    static int i(){
        int x=s.nextInt();
        return x;
    }
    static int[] input(int n){
        int a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=i();
        return a;
    }

    
}
