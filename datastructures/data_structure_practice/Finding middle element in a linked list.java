class hello
{
  public int middle(Node head)
  {
    Node fast=head;
    Node slow=head;
    while(fast!=null && fast.next!=null)
    {
      slow=slow.next;
      fast=fast.next.next;
    }
    return slow.data;
