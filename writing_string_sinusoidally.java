class Main {
  public static void main(String[] args) {
    System.out.println(sinusoidal ("Hello_world!"));
  }

  public static String sinusoidal (String s)
  {
   StringBuilder ob = new  StringBuilder () ;
   for (int i = 1; i < s.length(); i += 4) 
   {
   ob . append (s. charAt(i)) ;
   }

   for(int i = 0; i < s.length(); i += 2) 
   {
   ob . append (s. charAt(i)) ;
   }

  for(int i = 3; i < s.length(); i += 4) 
  {
   ob . append (s. charAt(i)) ;
  }
  return ob.toString ();
}}
