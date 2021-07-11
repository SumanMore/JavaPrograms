


public class Node
{
  public int data;
 
  public Node left,right;
  Node(int d)
  
  {
    data=d;
    left=null;
    right=null;
  }
}
public class test_if_binary_tree_is_symmetric
{
/*public static void preorder(Node root)
  {
    if(root!=null)
    {
      System.out.print("-"+root.data);
      preorder(root.left);
      preorder(root.right);

    }
  }*/
public static boolean isSymmetric (Node root)
 {
return root == null || checkSymmetric (root . left , root.right);
}

private static boolean checkSymmetric (Node  s0,
Node s1)
 {
if (s0 == null && s1 == null) 
{
return true ;
} 

else if (s0!= null && s1 != null) 
{
return s0.data == s1. data && checkSymmetric (s0.left , s1.right)&& checkSymmetric (s0.right , s1.left) ;
}

return false;
}
public static void main(String[] args)
 {
  Node A=new Node(1);
  Node B=new Node(2);
  Node C=new Node(2);
 // Node D=new Node(17);
 Node D=new Node(10);
  Node E=new Node(10);
  Node F=new Node(6);
   Node G=new Node(6);
  A.left=B;
  A.right=C;
  B.right=D;
 
  C.left=E;
  D.right=F;
  E.left=G;
 //preorder(A);
 //System.out.println();
 System.out.println(isSymmetric (A));
 }}
