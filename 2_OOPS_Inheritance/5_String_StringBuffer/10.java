/*Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string. 
You may assume that n is between 0 and the length of the string, inclusive. 

Example1)
i/p:Wipro,3
o/p:propropro
Solution:
*/
import java.util.Scanner;
public class IntString {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	String  string1 = sc.nextLine();
	int a = sc.nextInt();
	String string2="";
	for(int i=0;i<a;i++){
		string2+=string1.substring(string1.length()-a);

	}
	 
	System.out.println(string2);	 
	
       }
}
