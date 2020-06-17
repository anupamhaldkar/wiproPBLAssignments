/*Given two strings, a and b, print a new string which is made of the following combination-first character of a, the first character of b, second character of a, second character of b and so on. 
Any characters left, will go to the end of the result.
Example1)
i/p:Hello,World
o/p:HWeolrllod

Solution:
*/
import java.util.Scanner;
public class TwoString {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	String  string1 = sc.nextLine();
	String  string2 = sc.nextLine();
	StringBuffer a = new StringBuffer();

	int n1 = string1.length();
	int n2 = string2.length();

	for(int i=0;i<n1||i<n2;i++){

		if(i<n1)
		a.append(string1.charAt(i));
		a.append(string2.charAt(i));
	}
	 
	System.out.println(a);	 
	
     }
}
