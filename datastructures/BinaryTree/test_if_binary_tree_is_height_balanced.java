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





public class test_if_binary_tree_is_height_balanced {
    
        public static void preorder(Node root)
        {
          if(root!=null)
          {
            System.out.print("-"+root.data);
            preorder(root.left);
            preorder(root.right);
      
          }
        }
         static class BalanceStatus
        {
          public boolean BF;
          public int height;
          BalanceStatus(boolean b,int h)
          {
            BF=b;
            height=h;
      
          }}
          public static boolean isBalanced(Node root) 
          {
      return check(root).BF;
      }
      
          public static BalanceStatus check(Node root)
          {
            if(root==null)
            {
              return new BalanceStatus(true,-1);
            }
            BalanceStatus LR=check(root.left);
            if(LR.BF==false)
               return LR;
            BalanceStatus RR=check(root.right);
            if(LR.BF==false)
               return RR;
      
          boolean bf=Math.abs(LR.height-RR.height)<=1;
        int height =Math.max(LR.height,RR.height)+1;
        return new BalanceStatus(bf , height);
      
                  
          }
        
        public static void main(String[] args) {
        Node A=new Node(1);
        Node B=new Node(2);
        Node C=new Node(3);
        Node D=new Node(4);
        Node E=new Node(5);
        Node F=new Node(6);
        A.left=B;
        A.right=C;
        B.left=D;
        B.right=E;
        C.left=F;
       preorder(A);
       System.out.println(isBalanced(A));
      
        }
      }
