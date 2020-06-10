/*Write a program to initialize an integer array and find the maximum and minimum value of the array.
Solution:
*/
class Main {
	public static void main(String[] args) {
		int[] a= {1,3,4,3,4,2};
		int max = a[0];
		int min = a[0];
		for (int i=1;i<a.length ;i++ ) {
			if(a[i]>max)
				max = a[i];
			if(a[i]<min)
				min = a[i];
		} 
		System.out.println("Maximum value "+max);
		System.out.println("Minimum value "+min);
}
}
