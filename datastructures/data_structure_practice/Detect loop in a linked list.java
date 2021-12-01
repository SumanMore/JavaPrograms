class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code 
        HashSet<Node> hs=new HashSet<>();
        while(head!=null)
        {
            if(hs.contains(head)) 
               return true;
            hs.add(head);
            head = head.next;
         }
        return false;
        
    }
}
