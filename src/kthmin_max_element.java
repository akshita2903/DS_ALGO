//package dsalgorithsms;
import java.util.*;


class kthmin_max_element{
    public static int kthSmallest(int[] arr, int k) 
    { 
        //Your code here
      /* 1-way  Arrays.sort(arr); t.c=O(nlogn)
       return arr[k-1];*/
       //2nd way
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++)
        {
            maxHeap.add(arr[i]);
            if(maxHeap.size()>k) maxHeap.poll();
        }
        return maxHeap.peek(); //t.c=O(klogn)
    } 
}
