/*Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57.
Solution:
*/
import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if((a%10)==(b%10))
			System.out.print(true);
		else
			System.out.print(false);
		}
}
