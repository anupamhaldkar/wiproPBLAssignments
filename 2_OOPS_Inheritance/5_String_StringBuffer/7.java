/*Given a string, if the first or last chars are 'x', return the string without those 'x' chars, otherwise return the string unchanged. 

If the input is "xHix", then output is "Hi".
If the input is "America", then the output is "America".
Solution:
*/
import java.util.Scanner;
public class FirstLast {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	String a = sc.nextLine();
	StringBuffer b = new StringBuffer();
	
	if(a.charAt(0)=='x' || a.charAt(a.length()-1)=='x')
	{ 
		for(int i=0;i<a.length();i++)
		        if(a.charAt(i)!='x')
			b.append(a.charAt(i));
	}
	else
		b.append(a);
	System.out.print(b);	
}
}
