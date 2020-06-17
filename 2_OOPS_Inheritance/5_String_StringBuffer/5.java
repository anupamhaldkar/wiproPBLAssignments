/*Write a java program that accepts a string and returns a new string without the first and last character of the input string.
Example1)
i/p:Suman
o/p:uma
 */

Solution:

import java.util.Scanner;
public class Version {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	String a = sc.nextLine();
	
	if(a.length()>2)
	{
		System.out.print(a.substring(1,a.length()-1));
	}
	else {
	
	}
		
       }
}
