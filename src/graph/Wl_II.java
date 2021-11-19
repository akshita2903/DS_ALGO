// Input:
// wordList = {"des","der","dfr","dgt","dfs"}
// startWord = "der", targetWord= "dfs",
// Output:
// 3
// Explanation:
// The length of the smallest transformation
// sequence from "der" to "dfs" is 3
// i,e "der" -> "dfr" -> "dfs". ans der->des->dfs
class WL_II{
   private HashSet<String> set=new HashSet<>();
    private Queue<Node> q;
    public ArrayList<ArrayList<String>> findSequences(String startWord, String targetWord, String[] wordList)
    { ArrayList<ArrayList<String>> paths=new ArrayList<>();
        q=new LinkedList<>();
        for(String w:wordList)
        set.add(w);
        if(!set.contains(targetWord)) //targetWord not in WordList
        return paths;

        q.add(new Node(startWord));
        while(!q.isEmpty())
        {
            int n=q.size();
            HashSet<String> removefrmSet=new HashSet<>();
            for(int i=0;i<n;i++){
                Node curr=q.poll();
                if(curr.parent.equals(targetWord))
                {
                paths.add(curr.path);
                }
                else{
                    //get nebr of current parent
                    ArrayList<String> nbr=getNbrs(curr.parent);
                    for(String words:nbr){
                        q.add(new Node(words,curr.path));
                        removefrmSet.add(words);
                    }
                    
                }
            }
            set.removeAll(removefrmSet);
        }
        return paths;
    }
    ArrayList<String> getNbrs(String word){
        char[] ch=word.toCharArray();
        ArrayList<String> nbr=new ArrayList<>();
        for(int i=0;i<ch.length;i++)
        {
            char temp=ch[i];
            for(char z='a';z<='z';z++){
                ch[i]=z;
                String w=new String(ch);
                if(set.contains(w)) nbr.add(w);
            }
            ch[i]=temp;
        }
        return nbr;
    }
}
class Node{
    String parent;
    ArrayList<String> path;
    Node(String parent){
        this.parent=parent;
        this.path=new ArrayList<>();
        this.path.add(parent);
    }
    Node (String par,ArrayList<String> prev_path){
        this.parent=par;
        this.path=new ArrayList<>();
        this.path.addAll(prev_path);
        this.path.add(par);
    }
}
