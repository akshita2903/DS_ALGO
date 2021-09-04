public class rotatebyone {
    public void rotate(long arr[], long n)
    {
    //1st approach------------------->>//
    int l=arr.length;
  /*  long b[]=new long[l];
    for(int i=1;i<n;i++) b[i]=arr[i-1];
    b[0]=arr[l-1];
    for(int i=0;i<n;i++) arr[i]=b[i];
    
    T.C=O(n) and S.C=O(n)*/
    //Optimization-----------//
    long temp=arr[l-1];
    for(int i=l-1;i>=1;i--) arr[i]=arr[i-1];
    arr[0]=temp;
    //T.C=O(n) and S.C=O(1)
    }
    
}
