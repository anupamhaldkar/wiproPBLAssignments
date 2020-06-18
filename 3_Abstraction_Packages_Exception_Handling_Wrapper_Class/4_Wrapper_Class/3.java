/*Note: The output displayed should contain 8 digits and should be padded with leading 0s(zeros), in case the returned String contains less than 8 characters.
For example, if the user enters the value 16, then the output should be 00010000
and if the user enters the value 100, the output should be 01100100
You are expected to use Integer class conversion method/s described in the PDF file. 
Use Scanner class to accept user inputs.
(Hint : You may use String.format() method for the expected output)
Solution:
*/
import java.util.*;
 class Leading {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		String a = Integer.toBinaryString(input);
		int len = 8 - a.length();
		String output = String.format("%0"+len+"d%s",0,a );
		System.out.println(output);
sc.close();
	}
}
