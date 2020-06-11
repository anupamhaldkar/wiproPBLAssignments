/*Write a program to reverse a given number and print.
Solution:
*/
import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev=0,rem=0;
		while(n>0){
			rem = n%10;
			rev=rev*10+rem;
			n/=10;
		}
		System.out.println(rev);
		
	}
}