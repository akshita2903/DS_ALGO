import java.util.*;

class countpairwithgivensum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        int k=sc.nextInt();
     System.out.println(getPairsCount(a,n,k));
      sc.close();
    }
   static int getPairsCount(int[] arr, int n, int k) {
        // code here
       int c=0;
       HashMap<Integer,Integer> mp=new HashMap<>();
       for(int i=0;i<n;i++)
       {
           if(!mp.containsKey(arr[i]))
           mp.put(arr[i],1);                   //time->O(n)
           else mp.put(arr[i],mp.get(arr[i])+1);
       }
       for(int i=0;i<n;i++) // time->O(n)
       {
           if(mp.containsKey(k-arr[i]))
           {
               int sum=mp.get(k-arr[i]);
               c+=sum;
              
              // mp.put(arr[i],0);
           }
            if(k-arr[i]==arr[i]) c--;
       }
       return c/2; 
       //Time->O(n)+O(n)=O(n)  space=O(n) for hahs-table
    }
    
}
