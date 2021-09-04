package heap;
import java.util.*;
// There are given N ropes of different lengths, we need to connect these ropes into one rope. The cost to connect two ropes is equal to sum of their lengths. The task is to connect the ropes with minimum cost.

// Example 1:

// Input:
// n = 4
// arr[] = {4, 3, 2, 6}
// Output: 
// 29
// Explanation:
// For example if we are given 4
// ropes of lengths 4, 3, 2 and 6. We can
// connect the ropes in following ways.
// 1) First connect ropes of lengths 2 and 3.
// Now we have three ropes of lengths 4, 6
// and 5.
// 2) Now connect ropes of lengths 4 and 5.
// Now we have two ropes of lengths 6 and 9.
// 3) Finally connect the two ropes and all
// ropes have connected.
// Total cost for connecting all ropes is 5
// + 9 + 15 = 29. This is the optimized cost
// for connecting ropes. Other ways of
// connecting ropes would always have same
// or more cost. For example, if we connect
// 4 and 6 first (we get three strings of 3,
// 2 and 10), then connect 10 and 3 (we get
// two strings of 13 and 2). Finally we
// connect 13 and 2. Total cost in this way
// is 10 + 13 + 15 = 38.
public class connect_n_ropes_with_min_cost {
    long minCost(long arr[], int n) 
    {
       
        return answer(arr,n);
    }
    long answer(long a[],int n)
    {
       PriorityQueue<Long> min_heap=new PriorityQueue<>();
      long cost=0L;
      for(int i=0;i<n;i++){
         min_heap.add(a[i]);
      }
      while(min_heap.size()>1)
      {
          long x=min_heap.peek();
          min_heap.remove(x);
          long y=min_heap.peek();
          min_heap.remove(y);
          cost+=x+y;
          min_heap.add(x+y);
      }
     
      return cost;
        
    }
    
}
