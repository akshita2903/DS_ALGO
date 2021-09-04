package BinaryTree;
import java.util.*;
public class check_mirror_n_ary_tree {
    static int checkMirrorTree(int n, int e, int[] A, int[] B) {
        // code here
        List<Stack<Integer>> st=new ArrayList<>();
        List<Queue<Integer>> q=new ArrayList<>();
        for(int i=0;i<(2*e);i++)
        {
            Stack<Integer> s=new Stack<>();
            st.add(s);
            Queue<Integer> q1=new LinkedList<>();
            q.add(q1);
        }
        for(int i=0;i<(2*e);i+=2)
        {
            if((i+1)<(2*e)){
            st.get(A[i]).push(A[i+1]); //connected components
            q.get(B[i]).add(B[i+1]);
            }
        }
        for(int i=0;i<n;i++)
        {
            while(!st.get(i).isEmpty() && !q.get(i).isEmpty()){
            int x=st.get(i).pop();
            int y=q.get(i).poll();
            if(x!=y) return 0;
            }
        }
        return 1;
       
    }
    
}
//time->O(n+(2*e)) ans space->O(2*e)
