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


public class root_to_leaf_path_with_specified_sum {
    
    
    public static boolean hasPathSum(Node node,
    int targetSum) 
    {
    return hasPathSumHelper (node, 0, targetSum);
    }
    private static boolean hasPathSumHelper (Node node,int partialPathSum , int targetSum)
     {
    if (node == null)
     {
    return false;
    }
    partialPathSum += node.data;
    if (node.left == null && node.right == null)
     { 
    return partialPathSum == targetSum;
    }
    // Non-leaf .
    return hasPathSumHelper (node . left , partialPathSum, targetSum)
    || hasPathSumHelper (node . right , partialPathSum, targetSum);
    }
    public static void main(String[] args)
     {
      Node A=new Node(1);
      Node B=new Node(2);
      Node C=new Node(10);
     // Node D=new Node(17);
     Node D=new Node(4);
      Node E=new Node(5);
      Node F=new Node(6);
       Node G=new Node(7);
      A.left=B;
      A.right=C;
      B.left=D;
      B.right=E;
     
      C.left=F;
      C.right=G;
      System.out.println(hasPathSum(A,8));
     }}
    
