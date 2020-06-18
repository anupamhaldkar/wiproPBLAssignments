/*Write a class MathOperation which accepts 5 integers through command line. Create an array using these parameters. Loop through the array and obtain the sum and average of all the elements and display the result. 
Various exceptions that may arise like ArithmeticException, NumberFormatException, and so on should be handled.
Solution:
*/
import java.util.*;
public class MathOperation {
public static void main(String[] args) {
		int[] a = new int[5];
		int sum = 0;
		double avg = 0;
		try {
			if(args.length!=5)
			throw new InputMismatchException();
			for(int i = 0; i < 5; i++)
				a[i] = Integer.parseInt(args[i]);
			for(int i = 0; i < 5; i++)
				sum += a[i];
				avg = sum/5;
			System.out.println("sum: " + sum);
			System.out.println("average: " + avg);	
		}
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException");
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
		}
	}
}
