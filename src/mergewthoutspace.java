import java.util.*;
public class mergewthoutspace {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int a[]=new int[n];
    int b[]=new int[m];
    merge(a,b,n,m);
    sc.close();
    
}
public static void merge(int arr1[], int arr2[], int n, int m) {
    // code here
    int temp=0;
  for(int i=m-1;i>=0;i--)
  {
      for(int j=n-1;j>=0 && arr1[j]>=arr2[i];j--)
      {
          temp=arr1[j];
          arr1[j]=arr2[i];
          arr2[i]=temp;
      }
  }
  Arrays.sort(arr1);
  Arrays.sort(arr2);
 //space=O(1),Time->O(n*m)+O(nlogn)+O(mlogm)
}
    
}
