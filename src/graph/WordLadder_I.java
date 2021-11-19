// iven two distinct words startWord and targetWord, and a list denoting wordList of unique words of equal lengths. Find the length of the shortest transformation sequence from startWord to targetWord.
// Keep the following conditions in mind:

// A word can only consist of lowercase characters.
// Only one letter can be changed in each transformation.
// Each transformed word must exist in the wordList including the targetWord.
// startWord may or may not be part of the wordList.
class WordLadder_I{
   public int wordLadderLength(String startWord, String targetWord, String[] wordList)
    {
        if(startWord.equals(targetWord)) return 0;
        boolean isPresent=false;
        for(String w:wordList){
            if(w.equals(targetWord))
            {
                isPresent=true;
                break;
            }
        }
        //if isPresent==false means tagetword is not in wordlist
        if(isPresent==false) return 0;
      Queue<String> q=new LinkedList<>();
      HashSet<String>set=new HashSet<>(); int steps=0;
      q.add(startWord); set.add(startWord);
      while(q.size()>0){
          int size=q.size();
          steps++;
          for(int i=0;i<size;i++){
              String w=q.poll();
              if(w.equals(targetWord)) return steps;
          
          for(String x:wordList){
              if(check(x,w) && !set.contains(x))
              {
                  q.add(x);
                  set.add(x);
              }
          }
          }
      }
      return 0;
    }
    boolean check(String x,String y){
        int c=0;
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)!=y.charAt(i)) c++;
        }
        return c<=1;
    }
}
