package dsa;

public class insert_at_end
{
	public static void main(String args[])
	{
		Node start=null;
		for(int i=1;i<=5;i++)
			
		{
			start=insert(i,start);
		}
		display(start);
		
	}
	public static Node insert(int value,Node start)
	{
		Node p=new Node(value);
		if(start==null)
		{
			start=p;
			
		}
		else 
		{
			Node q=start;
			while(q.next!=null)
			{
				q=q.next;
			}
			q.next=p;
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
	}

}
