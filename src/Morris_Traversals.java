import java.util.*;


class Node{
    Node left,right;
    int data;
    public Node(int data)
    {
        this.data=data;
        this.left=this.right=null;
    }

    public static void main (String[] args) {
       // GFG obj=new GFG();
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println("Root Inorder");
      MT_IN(root);
      System.out.println("Root PreOrder");
      MT_Pre(root);
      System.out.println("Root PostOrder Reversed");
      MT_Post(root);
        
     
        
        
        
    }
    static void MT_Pre(Node root)
    {
       //System.out.println("INeOrder  ");
       
        while(root!=null)
        {
          //System.out.print(root.data);
          if(root.left == null)
          {
              System.out.print(root.data+" ");
              root=root.right;
          }
          //else attach right node of cuur root to righmost node of left child of curr root
          else{
              Node p=root.left;
              while(p.right!=null && p.right!=root) p=p.right;
               
              if(p.right==null)
              {
                 p.right=root;
                  System.out.print(root.data+" ");
          root=root.left;
              }
              else{
                  p.right=null;
                   root=root.right;
               }
                  
            
            
        
              
          }
        }
        System.out.println();
    }
      static  void MT_IN(Node root)
        {
           // System.out.println("Inorder ");
            while(root!=null)
            {
                if(root.left==null)
                {
                    System.out.print(root.data+" ");
                    root=root.right;
                }
                else{
                    Node p=root.left;
                    while(p.right!=null && p.right!=root) p=p.right;
                    if(p.right == null)
                    {
                        p.right=root;
                        root=root.left;
                    }
                    else{
                        p.right=null;
                        System.out.print(root.data+" ");
                        root=root.right;
                    }
                }
            }
            System.out.println();
        }
      static  void MT_Post(Node root)
        {
       // System.out.println("Post Order");
       
        //swap pre ka left here with right
         //it will print root right left means reverse of post order,so store it in list and reverse
        //the list to get actual answer
        while(root!=null)
        {
            if(root.right==null)
            {
                System.out.print(root.data+" ");
                root=root.left;
            }
            else{
                Node p=root.right;
                while(p.left!=null && p.left!=root) p=p.left;
                if(p.left == null)
                {
                    p.left=root;
                    System.out.print(root.data+" ");
                    root=root.right;
                }
                else{
                    p.left=null;
                    root=root.left;
                }
            }
        }
        System.out.println();
        }
    
}
