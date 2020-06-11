/*Write a Java program to find if the given number is palindrome or not.

Solution:
*/
class Main {
	public static void main(String[] args) {
				
		int n = Integer.parseInt(args[0]);
		int rev=0,rem=0;
		int a=n;
		while(n>0){
			rem = n%10;
			rev=rev*10+rem;
			n/=10;
		}
		System.out.println(rev==a?a+" is a Palindrome":a+" is not a Palindrome");
		
	}
}
