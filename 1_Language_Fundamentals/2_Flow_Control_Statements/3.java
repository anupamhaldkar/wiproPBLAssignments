/*Write a program to check if a given integer number is odd or even.
Solution:
*/
import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		if(a%2==0)
			System.out.println("Number is Even");
		else
			System.out.println("Number is Odd");
		}
}
