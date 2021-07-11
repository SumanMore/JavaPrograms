public class Node<T> 
{
public T data;
public Node<T> next;

public Node(T i) 
{
	// TODO Auto-generated constructor stub
    data=i;
    next=null;
}
}


public class Main 
{
	public static Node insert(int d,Node head)
	{
		Node<Integer> newNode=new Node<>(d);
		newNode.next=head.next;
		head.next=newNode;
		return head;
	}
	public static void display(Node node)
	{
		System.out.println("\n LinkedList");
		while(node!=null)
		{
			System.out.print("-"+node.data);
			node=node.next;
		}
	}
	
	public static void delete(Node<Integer> node) {
		node.data=node.next.data;
		node.next=node.next.next;
	}
	public static void main(String[] args) {
		
		Node<Integer> head=new Node<>(1);				
		//insert 5 nodes
		for(int i=5;i>0;i--)
			head=insert(i+1,head);
		display(head);
		int n=3;
		Node<Integer> tmp=head;
		for(int i=1;i<n;i++)
			tmp=tmp.next;
		delete(tmp);
		System.out.println("\n After deletion:");
		display(head);
	}
}
