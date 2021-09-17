/* Exaplanation:
power(5,6)->5*5*5*5*5*5
->25*5*5*5*5==25*25*25


*/


class Power_of_large_number{
    long power(long x,long n){  //power(10,7)                                          //power(100,3)
        if(n==0l) return 1L;
      if(n==1L) return x;                                                             //->10000
        if(n%2==0L)   //7%2==0->f
            return power((x*x)%mod,(n/2));
        return ((x%mod)*power((x*x)%mod,(n-1)/2))%mod; //10*p(10*10,(7-1)/2=3)         //100*p(100*100,1)
    }                                                        //|
                                                             //|
                                                             //10*100*10000->10^7
}
