package sortings_and_searching;
//use Cyclic sort
class Smallest_Positive_Missing_Number{
      static int missingNumber(int arr[], int size)
    {
        int i=0;
        while(i<size)
        {
            int pos=arr[i]-1;
            if(arr[i]<=0 || arr[i]>size || arr[pos]==arr[i])
            i++;
            else
            {
                int temp=arr[pos];
                arr[pos]=arr[i];
                arr[i]=temp;
            }
            
        }
        for(i=0;i<size;i++)
        {
            if(arr[i]!=i+1)
            return i+1;
        }
        return size+1;
    }
}
