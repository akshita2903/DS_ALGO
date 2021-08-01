import java.util.*;
import java.math.*;
class three_divisors{

    public boolean isThree(int n) {
    return check(n);
        
    }
  boolean check(int n){
    int square_root=sqrt(n);
   return (n!=1 && square(square_root)==n && isprime(square_root));
  
  }
  boolean isprime(int n){
    for(int i=2;i<=sqrt(n);i++){
      if(n%i==0) return false;
    }
    return true;
  }
  int sqrt(int n){
    return (int)(Math.sqrt(n));
  }
  int square(int x){
    return (x*x);
  }

  
  
  
  
}
