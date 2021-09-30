package greedy;
import java.util.*;
class Pair{
    int x,y;
    Pair(int x1,int y1){
        x=x1;
        y=y1;
    }
}
class comparebylast implements Comparator<Pair>{
    public int compare(Pair p1,Pair p2){
        return p1.y-p2.y;
    }
}
public class Max_length_pair {
   
    
    int maxChainLength(Pair arr[], int n)
    {
       // Approach similar to n-meeting room
      ArrayList<Pair> list=new ArrayList<>();
      for(int i=0;i<n;i++){
          Pair p=arr[i];
          list.add(new Pair(p.x,p.y));
      }
      Collections.sort(list,new comparebylast());
      int count=1;
      Pair prev=list.get(0);
      for(int i=1;i<n;i++){
          Pair next=list.get(i);
          if(next.x>prev.y){
              prev=next;
              count++;
          }
      }
      return count;
       
    }
}
