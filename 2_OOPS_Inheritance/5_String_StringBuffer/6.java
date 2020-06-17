/*Given 2 strings, a and b, return a new string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.

The strings will not be the same length, but they may be empty (length 0).

If input is "hi" and "hello", then output will be "hihellohi".
Solution:
*/
import java.util.Scanner;

public class LongShort {

public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	String a = sc.nextLine();
	String b = sc.nextLine();
	
	if(a.length()>b.length())
		System.out.print(b+a+b);
	else 
		System.out.print(a+b+a);

		
       }
}
