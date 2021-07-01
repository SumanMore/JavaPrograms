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


public class merge_two_sorted_list
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
		System.out.println("LinkedList:");
		while(node!=null)
		{
			System.out.print("-"+node.data);
			node=node.next;
		}
	}
	
	public static Node<Integer> merge(Node l1,Node l2)
	{
		Node<Integer> dummy=new Node<>(0);
		Node<Integer> curr=dummy;		
		Node<Integer> p1=l1;
		Node<Integer> p2=l2;
		
			
		while(p1!=null && p2!=null)
		{
			if(p1.data < p2.data)
			{
				curr.next=p1;
				p1=p1.next;
			}
			else
			{
				curr.next=p2;
				p2=p2.next;
			}
			curr=curr.next;
		}
		//Appends the remaining
		// Appends the remaining nodes of pi or p2.
		curr.next = p1 != null ? p1 : p2 ;
		
		return dummy.next;
		
	}

	public static void main(String[] args) {
		
		Node<Integer> head1=new Node<>(1);				
		//insert 5 nodes
		for(int i=5;i>0;i--)
			head1=insert(i+2,head1);
		display(head1);
		
		Node<Integer> head2=new Node<>(1);				
		//insert 5 nodes
		for(int i=10;i>5;i--)
			insert(i+3,head2);
		display(head2);
		
		//Create list3
		Node<Integer> head3=new Node<>(1);	
		head3=merge(head1,head2);
		display(head3);
	}
}
