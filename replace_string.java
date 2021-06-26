/*The global replace function is a string-processing algorithm found in every word 
processor. 
Write a method that takes three String arguments: 
a document, a tar get string, and a replacement string.
 The method should replace every occurrence of the target string in the document with the re- placement string.
  For exam ple, if the document is “ To be or not to be, that is the question,” 
  and the target string is “be”, and the replacement string is “see,”
   the result should be, “To see or not to see, that is the question." 
   */

import java.util.*;
public class replace_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String doc=sc.nextLine();
String target=sc.nextLine();
String replacement=sc.nextLine();
doc=doc.replaceAll(target,replacement);
System.out.println(doc);
}
}

/*
output:
To be or not to be, that is the question
be
see
To see or not to see, that is the question
*/