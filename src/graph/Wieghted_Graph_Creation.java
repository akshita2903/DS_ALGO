package graph;
import java.util.ArrayList;
class Wieghted_Graph_Creation{
     static   ArrayList<ArrayList<ArrayList<Integer>> >gpi=new ArrayList<>();
       static class graph{
            int vertex,nbr,wt;
            graph(int v)
            {
                vertex=v;
                for(int i=0;i<=v;i++)
                    gpi.add(new ArrayList<ArrayList<Integer>>());
                                }
               static void create_graph(int v,int nbr,int wt){
           ArrayList<Integer> t1=new ArrayList<>();
           ArrayList<Integer> t2=new ArrayList<>();
           t1.add(v);
           t1.add(wt);
           t2.add(nbr);
           t2.add(wt);
           gpi.get(v).add(t2);
           gpi.get(nbr).add(t1);

               }
                            }
                         static    void print(){
           for(int i=0;i< gpi.size();i++){
               System.out.println("Src "+ i+"-> ");
               for(ArrayList<Integer> x:gpi.get(i))
               System.out.println(x.get(0)+" weight "+x.get(1));
           }
                            }

        public static void main(String[] args) {
            graph g=new graph(8);
            g.create_graph(0,1,4);
            g.create_graph(1,2,8);
            g.create_graph(0,7,8);
            g.create_graph(7,6,1);
            g.create_graph(2,8,2);
            g.create_graph(6,5,2);
            g.create_graph(2,3,7);
            g.create_graph(3,4,9);
            print();

        }
  
  
  
}
