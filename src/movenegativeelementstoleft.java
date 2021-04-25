 class movenegativeelementstoleft {
    
void negativetooneside(int a[])
{
    int n=a.length;
int left=0,right=n-1;
while(left<=right)
{
    if(a[left]<0 && a[right]<0)
     left++;
     else if(a[left]<0 && a[right]>0) right--;
     else if(a[left]>0 && a[right]<0) //swapp
     {
         int temp=a[left];
         a[left]=a[right];
         a[right]=temp;
         left++;
         right--;
     }
     else{
         left++;
         right--;
     }
}
}
    
}
