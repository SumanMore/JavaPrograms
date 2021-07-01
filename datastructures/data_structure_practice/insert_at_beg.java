package dsa;

public class insert_at_beg {
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
	public static void main(String args[])
	{
		int i;
		Node start=null;
		for(i=5;i>0;i--)
		{
			start=insert(i,start);

		}
		display(start);
	}
}

