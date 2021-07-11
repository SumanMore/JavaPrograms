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


public class SUM_THE_ROOT_TO_LEAF_PATHS_IN_A_BINARY_TREE 

{
  public static int sumRootToLeaf (Node root) 
{
return sumRootToLeafHelper(root , 0);
}
private static int sumRootToLeafHelper (Node  root,
int partialPathSum) 
{
if (root == null)
 {
return 0;
 }
partialPathSum = partialPathSum * 2 + root.data;
if (root.left == null && root.right == null) 
{ // Leaf.
return partialPathSum;
}
// Son-leaf .
return sumRootToLeafHelper(root.left , partialPathSum)+ sumRootToLeafHelper(root.right , partialPathSum);
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
 System.out.println(sumRootToLeaf(A)) ;
 }}
