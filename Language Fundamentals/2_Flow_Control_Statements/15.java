/*Write a program to print the sum of all the digits of a given number.
Solution:
*/
import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		for (;n>0 ;n=n/10 ) {
				sum+=n%10;
			}	
			System.out.println(sum);
	}
} 
