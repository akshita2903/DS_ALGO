//dutch national flag algorithm used
public class sortarrayof120 {
    void sort012(int a[], int n)
{
  int low=0,mid=0,high=n-1,temp=0;
  while(mid<=high)
  {
      switch(a[mid])
      {
          case 0:
          {
              temp=a[mid];
              a[mid]=a[low];
              a[low]=temp;
              mid++;
              low++;
              break;
          }
          case 1:{
              mid++;
              break;
          }
          case 2:{
              temp=a[mid];
              a[mid]=a[high];
              a[high]=temp;
              high--;
              break;
          }
      }
  }
}
    
}
