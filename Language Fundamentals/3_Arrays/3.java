/*Write a program to initialize an integer array with values and check if a given number is present in the array or not.                                            If the number is not found, it will print -1 else it will print the index value of the given  number in the array.
Solution:
*/
class Main {
	public static void main(String[] args) {		
int[] a= { 1, 3, 4, 3, 4, 2};
		int search = 4 ;
		int f=0;
		for (int i=0;i<a.length ;i++ ) {
			if(a[i]==search)
			{	System.out.println(i);
				f=1;
				break;
			}
		}
		if(f!=1)
		System.out.println(-1);
}
}
//Input – [ 1, 3, 4, 3, 4, 2]
