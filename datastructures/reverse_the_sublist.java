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



public class reverse_a_sublist {
public static Node insert(int d,Node head)
		{
			Node<Integer> newNode=new Node<>(d);
			newNode.next=head.next;
			head.next=newNode;
			return head;
		}
		
		public static void display(Node node)
		{
			System.out.println(" ");
			while(node!=null)
			{
				System.out.print("-"+node.data);
				node=node.next;
			}
		}
		
		public static Node<Integer> reverseSublist(Node L,int start,int finish)
		{
			if(start == finish) {
				return L;
			}
			Node<Integer> dummy=new Node<>(0);
			dummy.next=L;
			Node<Integer> subHead=dummy;
			int k=1;
			while(k++ < start) {
				subHead=subHead.next;
			}
			//Reverse sublist
			Node<Integer> subIt=subHead.next;
			while(start++ < finish) {
				Node<Integer> temp=subIt.next;
				subIt.next=temp.next;
				temp.next=subHead.next;
				subHead.next=temp;
			}		
			return dummy.next;
		}

		public static void main(String[] args) {
			
			Node<Integer> head=new Node<>(1);				
			//insert 5 nodes
			for(int i=4;i>0;i--)
				head=insert(i+1,head);
			display(head);
			reverseSublist(head,2,4);
			display(head);
			
		}
	}
