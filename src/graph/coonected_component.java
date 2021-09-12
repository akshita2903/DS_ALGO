package graph;
import java.util.*;

public class coonected_component {
    



    static ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
   static int v;
    coonected_component(int vertex)
    { this.v=vertex;
        for(int i=0;i<v;i++)
            graph.add(i,new ArrayList<Integer>());
    }
    void create_graph(int src,int dst){
        graph.get(src).add(dst);
        graph.get(dst).add(src);
    }
static void printgraph(){
    int size=graph.size();
    System.out.println(size);
    for(int i=0;i<size;i++){
        for(int x:graph.get(i))
        {
            System.out.println(i+"->"+x);
        }
    }

}
static void get_component(){
int count=0;
        boolean[] vis=new boolean[v+1];
        for(int i=0;i<v;i++){
            if(!vis[i]) {

                get_com(i,vis);
                count++;
                System.out.println();

            }
        }
    System.out.println("there are "+count+" connected components");
    if(count==1)
    System.out.println("Graph is Connected");
    else System.out.println("Graph is Not connected");

}
static void get_com(int src,boolean[] vis){
   vis[src]=true;
    System.out.print(src+" ");
   for(int x:graph.get(src))
   {
       if(!vis[x])
       {
           get_com(x,vis);
       }
   }
}

    public static void main(String[] args) {
       coonnected_component g=new coonnected_component(7);
        g.create_graph(0,1);
        g.create_graph(2,1);
        g.create_graph(3,5);
        g.create_graph(4,6);
        boolean[] vis=new boolean[7];
        System.out.println("Graph is");
        printgraph();
        System.out.println("Connected components:");
        get_component();
    }
}
