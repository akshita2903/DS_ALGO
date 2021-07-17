package heap;
import java.util.*;
 class min_heap {
    static Scanner s=new Scanner(System.in);
   public  static void main(String str[]){
       int n=s.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++){
           a[i]=s.nextInt();
       }
      a=heap(a,n);
      for(int i:a) System.out.print(i+" ");
   }
   static int[] heap(int a[],int n){
       for(int i=n-1;i>=0;i--){
           heapify(a,n,i);
       }
       return a;
   }
  static void heapify(int a[],int n,int parent)
{
int largest=parent;
int left_child=(2*parent)+1,right_child=(2*parent)+2;
if(left_child<n && a[largest]>a[left_child])
largest=left_child;
if(right_child<n && a[largest]>a[right_child])
largest=right_child;
if(largest!=parent){
    swap(a,largest,parent);
}
else return;

} 
static void swap(int a[],int i,int j){
    int t=a[i];
    a[i]=a[j];
    a[j]=t;
}   
}
