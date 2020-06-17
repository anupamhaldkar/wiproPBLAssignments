/*Write a java program that will concatenate 2 strings and return the result. The result should be in lowercase.
Note:If the concatenation creates a double-char, then one of the characters need to be omitted.
Solution:
*/
import java.util.Scanner;

public class TwoString {

public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	String a = sc.next();
	String b = sc.next();
              a = a.toLowerCase();
	b = b.toLowerCase();
	int l=a.length();
	int r=0;
	if(a.charAt(a.length()-1)==b.charAt(0))
		l=l-1;
	
		
	
	if(l==a.length())
	System.out.println(a.substring(0,l)+" "+b.substring(0));
	else
		System.out.println(a.substring(0,l)+b.substring(0));
       }
}
