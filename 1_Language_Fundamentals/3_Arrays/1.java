/*Write a program to initialize an integer array and print the sum and average of the array.
Solution:
*/
class Main {
	public static void main(String[] args) {
int[] a= {1,3,4,3,4,2};
		int sum = 0;
		for (int i=0;i<a.length ;i++ )
 {
			sum+=a[i];
		} 
		System.out.println("sum is "+sum);
		System.out.println("Average is "+(float)sum/a.length);
}
}
