/*
 * Write an program to print all permutations of a given String in Java.
 *  For example, if given input is "123" then your program should print all 6 permutations 
e.g. "123”, “132", "213”, “231", "312” and “321”. 
 */
import java.util.Scanner;

public class print_permutation {
	public static void permute(String str, int l, int r) {
		if (l==r) {
			System.out.println(str);
		}else {
			for(int i =0; i<=r; i++) {
				str = swap(str, l, i);
				permute(str, l+1, r); 
                str = swap(str,l,i); 
			}
		}
	}
	
	public static String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next(); 
        int n = str.length(); 
       permute(str, 0, n-1);

	}

}
/*
output
123
213
123
132
123
213
231
231
321
312
*/