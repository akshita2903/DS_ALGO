package Stack_AND_Queue{
  /*
  Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation: 
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
  
  
  */
  class Sliding_Window_Maximum
  {
     public int[] maxSlidingWindow(int[] nums, int k) {
        
        int n=nums.length;
        int[] res=new int[n-k+1];
        int window=0;
        Deque<Integer> dq=new LinkedList<>();
       //front me hmsesa prev window ka max hoga
        for(int i=0;i<k;i++){
            while(dq.isEmpty()==false && nums[dq.peekLast()]<=nums[i])
                dq.removeLast();
            dq.addLast(i);
        }
        for(int j=k;j<n;j++)
        {
            int r=j-k;
            res[window++]=nums[dq.peekFirst()]; //front ka element
            
            //now remove elemnt ,if any,which are not part of current window
           
            while(!dq.isEmpty() && dq.peekFirst()<=r) dq.removeFirst();
               while(!dq.isEmpty() && dq.peekLast()<=r) dq.removeLast();
             
            //now remove element from dq which can not be maximum element for current window or upcoming windows(same as used in for loop of 0 to k)
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[j])
                dq.removeLast();
            
            //why not checking from front
            //Ans-we ha already assumed that max element will be at front
            dq.addLast(j);
        }
        res[window]=nums[dq.peekFirst()];
        return res;
    }
  }
  
  
  
  //t.c->O(n)  for traversing
  //space->O(k) at max dq can have k elements
  
}
