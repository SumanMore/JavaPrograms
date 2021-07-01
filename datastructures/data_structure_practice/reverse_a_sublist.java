package dsa;

public class reverse_a_sublist {

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
	
	public static Node reverse(int beg,int end,Node start)
	{
		if (beg == end)
		  {
			return start;
		}
		
		Node nodebeforesublist=start;
		
		int k = 1;
		while (k++ < beg)
		{
		nodebeforesublist=nodebeforesublist.next;
		}
		
		Node workingptr=nodebeforesublist.next;
		while (beg++ < end) {
		Node  nodetobeextracted = workingptr.next ;
		workingptr.next = nodetobeextracted .next;
		nodetobeextracted .next = nodebeforesublist.next ;
		nodebeforesublist.next = nodetobeextracted ;
		}
		
return start;
	}
	public static void main(String args[])
	{
		int i;
		int beg=2,end=5;
		Node start=null;
		for(i=7;i>0;i--)
		{
			start=insert(i,start);

		}
		display(start);
		System.out.println();
		reverse(beg,end,start);
		display(start);
	}
}


