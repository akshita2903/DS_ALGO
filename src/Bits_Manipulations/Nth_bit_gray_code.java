/*
Question:
An n-bit gray code sequence is a sequence of 2n integers where:

Every integer is in the inclusive range [0, 2n - 1],
The first integer is 0,
An integer appears no more than once in the sequence,
The binary representation of every pair of adjacent integers differs by exactly one bit, and
The binary representation of the first and last integers differs by exactly one bit.
Given an integer n, return any valid n-bit gray code sequence.
*/
class Nth_bit_gray_code{
  
   public List<Integer> grayCode(int n) {
   return gc(n);
        
    }
    /*
    PATTERN----
     0 1 3 2 ->N=2
     0 1 3 2 6 7 5 4 ->N=3;
     **MAKE SURE POWER OF 2 SHOULD NOT BE ADJACENT
    *** 0 AND THE GREATEST POWER OF 2 IN N SHOULD BE AT STARTING AND ENDING INDEX OF LIST
    N BIT GC COMES FROM (N-1) GC 
    */
    List<Integer> gc(int n){
        List<Integer> res=new ArrayList<>();
        res.add(0); //first element has to be zero
        for(int i=0;i<n;i++)
        {
            int size_of_lis=res.size();
            int power_of_2=1<<i;
            for(int j=size_of_lis-1;j>=0;j--) //iterating the list
                res.add(res.get(j)|power_of_2); //get elemnt at j th index and do OR //with pow(2,i);
        }
        return res;
    }
  
  
}
