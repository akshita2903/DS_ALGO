package graph;
import java.util.*;
class UnionSetAndPathCompression{
  int[] rank=new int[100+1];
    
	int find(int A[],int X)
        {
          if(A[X]==X)
          return X;
          return A[X]=find(A,A[X]);
	}
	void unionSet(int A[],int X,int Z)
        {
            
         int parx=find(A,X);
         int parz=find(A,Z);
    //   if(X==Z) return ;
       A[parx]=parz;
         
	}
}
