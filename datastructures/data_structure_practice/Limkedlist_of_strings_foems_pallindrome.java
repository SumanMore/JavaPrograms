class GfG
{
    public static boolean compute(Node node)
    {
           String str = "";
        while (node != null)
        {
            str = str.concat(node.data);
            node = node.next;
        }
  
       
         return isPalidromeUtil(str);
    }
    
         static boolean isPalidromeUtil(String str)
    {
        int length = str.length();
        for (int i=0; i<length/2; i++)
        {
            if (str.charAt(i) != str.charAt(length-i-1))
            {
                return false;
            }}
        return true;
    }
  
}
        
