/*Write a Java program that accepts a string (with * in it). The program should return a new string in which the following characters are removed-*,the characters that are to the left and right of *
Example1)
i/p:ab*cd
o/p:ad

Solution:
*/

import java.util.Scanner;
public class Star {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	String  h = sc.nextLine();
	StringBuffer a = new StringBuffer(h);
	int s = a.indexOf("*");
	int l = a.lastIndexOf("*");
	if(s!=-1)
	      a.delete(s-1,l+2);
	System.out.println(a);	 
	
}
}

