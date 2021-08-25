package BinaryTree.src.strings;
class max_diff_0_and_1{
    public static void main(String[] args) {
    }
         int maxSubstring(String S) {
        // code here
          int g_max=-1,l_max=0;
          for(int i=0;i<S.length();i++)
          {
             char y=getchar(S,i);
            
         l_max+=(int)y==48?1:-1;
             if(l_max>g_max) g_max=l_max;
             if(l_max<0) l_max=0;
          }
         
          return g_max;

    }
    static char getchar(String s,int i){
        return s.charAt(i);
    }
    }
