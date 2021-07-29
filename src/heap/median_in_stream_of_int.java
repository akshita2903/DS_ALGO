package heap;
import java.util.*;
public class median_in_stream_of_int {
    MedianFinder obj=new MedianFinder();
}
    class MedianFinder {

        /** initialize your data structure here. */
      PriorityQueue<Integer> min,max;
      
        public MedianFinder() {
           min=new PriorityQueue<>();
          
          
          
          max=new PriorityQueue<>(Collections.reverseOrder());
        }
        
        public void addNum(int num) {
     max.add(num);
          min.add(max.poll());
          if(min.size()>max.size())
            max.add(min.poll());
          // if(max.size()>0 && min.size()>0){
          //   if(max.peek()>min.peek())
          //   {
          //     int x=max.peek(),y=min.peek();
          //     max.remove(x); min.remove(y);
          //     max.add(y);
          //     min.add(x);
          //   }
          // }
          
          
            
        }
        
        public double findMedian() {
            int x=max.size(),y=min.size();
          if((x+y)%2==0) return (max.peek()+min.peek())/2.0;
          else return max.peek();
        }
    }
    
    

