/*Write a program which takes asinput a binary tree and performs an inorder traversal
of the tree. Do not use recursion. Nodes do not contain parent references.*/


public class Node1
{
  public char data;
  public Node1 left,right;
  Node1(char d)
  {
    data=d;
    left=null;
    right=null;
  }
}
import java.util.*;
class Main
{
  public static void inorder(Node1 root)
  {
    if(root!=null)
    {
      inorder(root.left);
      System.out.print("-"+root.data);
      inorder(root.right);

    }}
    public static List<Character> inorder1 (Node1  root)
     {
Deque <Node1> s= new LinkedList<>();
List<Character> res=new LinkedList<Character>();
Node1 curr=root;

while ( !s. isEmpty () || curr != null) {
if (curr != null) {
s. addFirst (curr) ;
// Going left.
curr = curr. left ;
} else {
// Going up .
curr = s.removeFirst () ;
res.add((char)curr.data) ;
// Going right.
curr = curr.right;
}
}
return res;
    }

  public static void main(String args[])
  {
    Node1 A=new Node1('A');
    Node1 B=new Node1('B');
    Node1 C=new Node1('C');
    Node1 D=new Node1('D');
    Node1 E=new Node1('E');
    Node1 F=new Node1('F');
    A.right=C;
    A.left=B;
    B.left=D;
    B.right=E;
    C.left=F;
    inorder(A);
    System.out.println(inorder1(A));


  }
}
