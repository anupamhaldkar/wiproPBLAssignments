/*Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.

Solution:
*/
class Main {
	public static void main(String[] args) {
				
		int[] a= {65,69,73,77,104,83,85};
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int firstm = Integer.MAX_VALUE;
		int secondm = Integer.MAX_VALUE;
		for (int i=0;i<a.length ;i++ ) 
{
			if(a[i]>first)
			{
				second = first;
				first = a[i];
			}
			else if(a[i]>second)
				second = a[i];
			if(a[i]<firstm)
			{	secondm = firstm ; 
				firstm = a[i];
			}
			else if(a[i]<secondm)
				secondm = a[i];
		}
	  System.out.println("Largest "+(int)first+" Larger "+(int)second);
	  System.out.println("Smallest "+(int)firstm+" Smaller "+(int)secondm);
}
}
