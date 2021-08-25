package BinaryTree.src.arrays;
public class missingandrepeating {
    int[] findTwoElement(int arr[], int n) {
        int xor=0,x=0,y=0;
        for(int i=0;i<n;i++) {
            xor^=arr[i];
            xor^=(i+1);
        } //x^y=xor
        int set_bit=xor & (~(xor-1)); //find first right set bit
        for(int i=0;i<n;i++)
        {
            if((arr[i]& set_bit)!=0) x^=arr[i]; //if set_bit pos==arr[i]'s right set bit pos. put in x bucket
            else y^=arr[i]; //else in y bucket
            if(((i+1) &set_bit)!=0) x^=(i+1); //if set_bit pos==(i+1)'s right se t bit ps put it in x buck'
            else y^=(i+1);
        }
    

        int z=0;
        int a[]=new int[2];
       for(int i=0;i<n;i++){
           if(y!=arr[i])z++;
       }
       if(z==n) {
           a[0]=x;
           a[1]=y;
       }
       else{
           a[1]=x;
           a[0]=y;
       }
        return a;


        }

}
