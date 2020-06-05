/*Write a Program to accept two integers as command line arguments and print the sum of the two numbers

Example1)
C:\>java Sample 10 20
O/P Expected : The sum of 10 and 20 is 30
Solution:
*/
class Main {
	public static void main(String[] args) {
		System.out.print("The sum of "+args[0]+" and "+args[1]+" is "+(Integer.parseInt(args[0])+Integer.parseInt(args[1])));
	}
}
