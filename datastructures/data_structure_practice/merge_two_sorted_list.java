package dsa;

public class merge_two_sorted_list {

	
		public static Node insert(int value,Node start)
		{
			Node p=new Node(value);
			if(start==null)
			{
				start=p;
			}
			else
			{
				p.next=start;
				start=p;
			}
			return start;
		}
		public static void display(Node start)
		{
		Node t=start;
		while(t!=null)
		{
			System.out.print(t.data+" ");
			t=t.next;
		}
		System.out.println();
		}
		
		public static Node merge(Node head1,Node head2)
		{
			Node p1=head1;
			Node p2=head2;
			Node head3=new Node(0);
			Node s=head3;
			
			while (p1 != null && p2 != null) {
				if (p1.data <= p2.data) 
				{
				s.next = p1;
				p1 = p1.next ;
				}
				else {
				s.next = p2 ;
				p2 = p2.next ;
				}
				s = s.next ;
				}
				
				s.next = p1 != null ? p1 : p2 ;
				return head3.next;}
		public static void main(String args[])
		{
			int i;
			Node start=null,start1=null,start2=null;
			for(i=10;i>5;i--)
			{
				start=insert(i-2,start);

			}
			display(start);
			for(i=15;i>10;i--)
			{
				start1=insert(i-3,start1);
			}
			display(start1);
			
			start2=merge(start,start1);
			
			display(start2);
			
		}
	}


