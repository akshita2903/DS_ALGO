
public class TernarySearchALGO {
    /*ternary serach is similar to binary search except that int this we divide array
    into 3 parts.and time complexity turn to O(log3(n)) from O(log2(n)).
    works for sorted array.
    */
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,7,10,11,15};
        int n=a.length;
        int high=n-1,low=0,val=4,f=0;
        while(low<=high) //similar to binary search,Iterative approach
        {
            int mid1=low+(high-low)/3; //m1=0+(9-0)/3=3 mid1<mid2
            int mid2=high-(high-low)/3; //m2=9-(9-0)/3=6
            if(val==a[mid1]) f=1; //chk if val is at a[mid1]
            else if(val==a[mid2]) f=1; //chk if val is at a[mid2]
            else if(val<a[mid1])//implies val lies on left of mid1 so high changes to mid1-1 as we have to now serach b/w low and mid1
            //or on extreme left portion of array;
            {
                
                high=mid1-1;
            }
            else if(val>a[mid2]) //if val lies on right of mid2 our low changes to m2+1 as we have to serach b/w mid2 and high
            //or on extreme right side of array
            {
    low=mid2+1;
            }
            else // if value lies in b/w mid1 and mid2
            {
                low=mid1+1;
                high=mid2-1;
            }
        }
     System.out.println(f==1?"Search successfull":"Value Not Present");
        
    }
    
}
