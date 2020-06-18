/*Write a Program to take care of Number Format Exception if user enters values other than integer for calculating average marks of 2 students. The name of the students and marks in 3 subjects are taken from the user while executing the program.
In the same Program write your own Exception classes to take care of Negative values and values out of range (i.e. other than in the range of 0-100)
Solution:
//NegativeValuesException.java
*/
package project;
public class NegativeValuesException extends Exception {
	NegativeValuesException(){
		System.out.println("NegativeValuesException");
	}
}

//ValuesOutOfRangeException.java
package project;

public class ValuesOutOfRangeException extends Exception {
	ValuesOutOfRangeException(){
		System.out.println("ValuesOutOfRangeException");
	}
}

//AverageMarks.java

package project;
import java.util.*;
public class AverageMarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{	
int sum=0;
for(int i = 0; i < 2; i++) {
			String name = "";
			int A = 0;
			int B = 0;
			int C = 0;
			System.out.println("\nStudent "+(i+1));
name = sc.nextLine();
				if (sc.hasNextInt())
				{	A = sc.nextInt();
					if (A < 0) 
						throw new NegativeValuesException();
					else if (A > 100)
						throw new ValuesOutOfRangeException();
				}
				else 
throw new NumberFormatException();
				if (sc.hasNextInt())
				{	B = sc.nextInt();
					if (B > 100) 
						throw new ValuesOutOfRangeException();
					else if (B < 0) 
						throw new NegativeValuesException();
				}
				else 
throw new NumberFormatException();
				if (sc.hasNextInt())
					{ C = sc.nextInt();
					if (C < 0) 
						throw new NegativeValuesException();
					else if (C > 100) 
						throw new ValuesOutOfRangeException();
					}
				else throw new NumberFormatException();
				
				System.out.println("\nName " + name);
				System.out.println("Marks A " + A);
				System.out.println("Marks B " + B);
				System.out.println("Marks C " + C);
				sc.nextLine();
				sum+=A+B+C;
			}
				
			System.out.println("Average "+sum/3.0);
		
			} catch (ArithmeticException e) {

			} catch (NegativeValuesException e) {
				
			} catch (ValuesOutOfRangeException e) {
				
			}finally {
				sc.close();
			}
	}
}
