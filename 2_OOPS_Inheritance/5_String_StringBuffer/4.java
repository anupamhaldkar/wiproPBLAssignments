/*Write a java program that will return the first half of the string, if the length of the string is even. It should return null for odd length string.
Solution:
*/
import java.util.Scanner;
public class Half {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	String a = sc.nextLine();
	
	if(a.length()%2==0)
	{
		System.out.print(a.substring(0,a.length()/2));
	}
	else {
	System.out.print((String)null);
	}
		
       }
} 
