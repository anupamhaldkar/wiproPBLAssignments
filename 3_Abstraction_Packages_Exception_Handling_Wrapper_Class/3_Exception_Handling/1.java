/*Write a program that takes as input the size of the array and the elements in the array. The program then asks the user to enter a particular index and prints the element at that index. Index  starts from zero.This program may generate Array Index Out Of Bounds Exception  or NumberFormatException .Use exception handling mechanisms to handle this exception. 
Solution:
*/
import java.util.*;
public class Trycatch {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the arrays");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements in the array: ");
		try {
			for(int i = 0; i < n; i++)
				a[i] = Integer.parseInt(sc.next());
			System.out.println("Enter the index of the array element you want to access");
			int index = sc.nextInt();
			System.out.println("The array element at index " + index + " = " + a[index]);
			System.out.println("The array element successfully accessed");
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("java.lang.ArrayIndexOutOfBoundsException");
	} catch(NumberFormatException e) {
		System.out.println("java.util.NumberFormatException");
	}
		
 	finally {	
 		sc.close();
 		}
 	}
}
