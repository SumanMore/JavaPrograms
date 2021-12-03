Node curr=head;
int c=0;
while(curr!=null)
{
  c++;
  curr=curr.next;
}
int r=c-n;
Node temp=head;
if(r<1)
{
  return -1;
}
for(int i=1;i<=r;i++)
{
  temp=temp.next;
}
int res=(int)temp.data;
return res;
