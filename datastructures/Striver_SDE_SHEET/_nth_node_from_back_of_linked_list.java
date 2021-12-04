Node curr=head;
int c=0;
while(curr.next!=null)
{
  c++;
  curr=curr.next;
}
int r=c-n;
Node temp=head;
for(int i=1;i<=r;i++)
{
  temp=temp.next;
}
System.out.print((int)temp.data);


  
