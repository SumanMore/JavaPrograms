class Node
{
    char data;
    Node left,right;
    Node(char d)
    {
        data=d;
        left=null;
        right=null;
    }
}

public class preorder {
    public static void main(String args[])
    {
            Node A=new Node('A');
            Node B=new Node('B');
            Node C=new Node('C');
            Node D=new Node('D');
            Node E=new Node('E');
            Node F=new Node('F');
            Node G=new Node('G');
            A.right=C;
            A.left=B;
            B.right=D;
            C.left=E;
            D.left=F;
            E.right=G;
            preorder(A);

    }
    public static void preorder(Node root)
    {
        if(root!=null)
        {
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);        }
    }
}
