/*Write a program to receive a color code from the user (an Alphabhet). 
The program should then print the color name, based on the color code.
Solution:
*/
import java.util.*;
class Main {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			char colorCode = sc.next().charAt(0);
		
		switch (colorCode) {
		case 'R':
			System.out.println("Red");
			break;
		case 'B':
			System.out.println("Blue");
			break;
		case 'G':
			System.out.println("Green");
			break;
		case 'O':
			System.out.println("Orange");
			break;
		case 'Y':
			System.out.println("Yellow");
			break;
		case 'W':
			System.out.println("White");
			break;
		default:
			System.out.println("Invalid Code");
		}
	}
}
