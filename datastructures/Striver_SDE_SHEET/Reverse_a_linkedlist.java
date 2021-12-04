Node n=null,finalist-null;
Node temp=start;
while(temp!=null)
{
  n=temp.next;
  temp.next=finalist;
  finalist=temp;
  temp=n;
}
start=finalist;
return start;
