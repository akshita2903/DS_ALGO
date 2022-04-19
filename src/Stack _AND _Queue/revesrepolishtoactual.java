import java.util.*;
public class revesrepolishtoactual{
    public int evalRPN(String[] tokens) {
        int ans=0;
        Stack<Integer> s=new Stack<Integer>();
for(String x:tokens)
{
    if(x.equals("+")) {
        int y=s.pop();
        int z=s.pop();
        s.push(z+y);
    }
      else if(x.equals("-")) {
        int y=s.pop();
        int z=s.pop();
        s.push(z-y);
    }
    else   if(x.equals("*")) {
        int y=s.pop();
        int z=s.pop();
        s.push(z*y);
    }
     else  if(x.equals("/")) {
        int y=s.pop();
        int z=s.pop();
        s.push(z/y);
    }
    else s.push(Integer.valueOf(x));
}


    return s.pop();
    }
}

