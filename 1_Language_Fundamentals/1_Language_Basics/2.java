/*Write a Program to accept a String as a command line argument and print a Welcome message as given below.
Example1)
C:\> java Sample John
O/P Expected : Welcome John

Solution:
*/
class Main {
	public static void main(String[] args) {
		System.out.print("Welcome "+args[0]);
	}
}

