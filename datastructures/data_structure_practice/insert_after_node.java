public class Node<T>{
		public T data;
		public Node<T> next;
		
		//Constructor
		Node(T d)
		{
			data=d;
			next=null;
		}
	}





public class insert_after_node {
	public static Node insert(int d,Node head)
	{
		Node<Integer> newNode=new Node<>(d);
		
		newNode.next=head.next;
		head.next=newNode;
		return head;
	}
	public static void display(Node node)
	{
		System.out.println("LinkedList:");
		while(node!=null)
		{
			System.out.print("-"+node.data);
			node=node.next;
		}
	}
public static void main(String[] args) {
		
		Node<Integer> head1=new Node<>(1);				
		//insert_after_node 5 nodes
		for(int i=5;i>0;i--)
			head1=insert(i+2,head1);
		display(head1);
}}
