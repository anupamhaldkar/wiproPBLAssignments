/*Given a string, return a new string made of 'n' copies of the first 2 chars of the original string where 'n' is the length of the string.
Solution: 
*/
import java.util.Scanner;
public class TwoString {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	String a = sc.nextLine();
	String b = "";
	
	if(a.length()==1)
	{
		b=b+a.charAt(0)+a.charAt(0);
	}
	else {
	for (int i=0;i<a.length() ;i++ ) {
		b=b+a.substring(0,2);
	}
	}
		System.out.println(b);
       }
}
