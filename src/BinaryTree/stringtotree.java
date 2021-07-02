package BinaryTree;
  /*package whatever //do not write package name here */
import java.util.*;
/*TN=TreeNode
si=starting index of string
e=ending index of string 
d=data of tree*/

public class stringtotree {

    static class TN{
    TN left,right; int d;
};
  static   TN nN(int y){
      TN x=new TN();
     x.left=null;
     x.right=null;
     x.d=y;
     return (x);
    }
    //method to find the index where '(' has its  ')'
    static int fi(String s,int si,int e)
    {
        if(si>e || e>s.length()) return -1;
        Stack<Character> st=new Stack<>();
        for(int i=si;i<=e;i++)
        {
            char c=s.charAt(i);
            if(c=='(') st.push(c);
            else if(c==')'){
                st.pop();
                if(st.isEmpty()) return i;
                
            }
        }
        return -1;
        
    }
    /*Method to convert string to tree*/
    static TN s2t(String s,int st,int e){
        if(st>e) return null; //empty String
        
        TN root=nN(s.charAt(st)-'0');
        int index=-1;
        if(st+1<=e && s.charAt(st+1)=='(') //check for child Node
        index=fi(s,st+1,e);
        if(index!=-1){
            root.left=s2t(s,st+2,index-1); //si+2=child after '(' for left child
            root.right=s2t(s,index+2,e-1); //index+2=char after '(' for right child
        }
        return root;
        
    }
    /*Method to check whether conversion is successfull or not*/ 
    static void preorder(TN root){
        if(root==null) return; //if root is null
        System.out.print(root.d+" ");
       preorder(root.left);
       preorder(root.right);
    }
    
	public static void main (String[] args) {
		
		String s="4(2(3)(1))(6(5))";
		TN root=s2t(s,0,s.length()-1);
	preorder(root);
	System.out.println();
	}
} 

