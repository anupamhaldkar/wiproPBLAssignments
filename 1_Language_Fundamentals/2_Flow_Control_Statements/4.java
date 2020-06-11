/*Write a program to check if the program has received command line arguments or not. 
If the program has not received arguments then print "No Values", else print all the values in a single line separated by ,(comma)
Solution:
*/
import java.util.*;
class Main {
	public static void main(String[] args) {
		if(args.length==0)
			System.out.print("No Values");
		else 
		{	for (int i=0;i<args.length-1;i++ ) 
			{
				System.out.print(args[i]+",");
			}
			System.out.print(args[args.length-1]);
		}
	}
}
