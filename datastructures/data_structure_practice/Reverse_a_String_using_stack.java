class Solution {
    
    public String reverse(String S){
        //code here
        StringBuilder ob= new StringBuilder();
        Stack<Character> ob1=new Stack<Character>();
        for(int i=0;i<S.length();i++)
        {
            ob1.push(S.charAt(i));
        }
        while(!ob1.isEmpty())
        {
            ob.append(ob1.pop());
        }
       S=ob.toString();
       return S;

}
}
