package dsa;



public class count_no_of_nodes
{
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
	
	}
	public static int count(Node start)
	{
		int c=0;
		Node t=start;
		while(t!=null)
		{
			t=t.next;
			c++;
			
		}
		return c;
			
	}
	public static void main(String args[])
	{
		int i;
		Node start=null;
		for(i=5;i>0;i--)
		{
			start=insert(i,start);

		}
		System.out.println("total elements");
		display(start);
		int c=count(start);
		System.out.println();
		System.out.println("count:" +c);
		
	}
}

