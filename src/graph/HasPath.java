package src.BinaryTree.graph;
class  HasPath{
    public boolean validPath(int n, int[][] edges, int src, int dst) {
        if(src==dst) return true;
        ArrayList<ArrayList<Integer>> l=new ArrayList<>();
        for(int i=0;i<=n;i++) l.add(new ArrayList<>());
        for(int[] e:edges){
            l.get(e[0]).add(e[1]);
            l.get(e[1]).add(e[0]);
        }
        boolean[] vis=new boolean[n+1];
        boolean hasPath=hasPath(l,src,dst,vis);
        return hasPath;
    }
    boolean hasPath( ArrayList<ArrayList<Integer>> l,int s,int d,boolean[] v){
        if(s==d) return true;
        v[s]=true;
        for(int i=0;i<l.get(s).size();i++){
            int x=l.get(s).get(i);
            if(v[x]==false){
                boolean ifpath=hasPath(l,x,d,v);
                if(ifpath) return true;
            }
        }
        return false;
    }
}