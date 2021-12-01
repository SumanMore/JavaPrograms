 public static void removeLoop(Node head){
       // code here
       // remove the loop without losing any nodes
       HashSet<Node> hs= new HashSet<>();
       
       Node curr=head;
       while(curr!=null){
           hs.add(curr);
           if(curr.next!=null && hs.contains(curr.next)){
               curr.next=null;
               return;
           }
           curr=curr.next;
       }
   }
