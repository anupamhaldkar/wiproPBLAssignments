/*Initialize an integer array with ascii values and print the corresponding character values in a single row.
Solution:
*/
class Main {
	public static void main(String[] args) {
				
		int[] a= {65,69,73,77,104,83,85};
		
		for (int i=0;i<a.length ;i++ )
 {
			System.out.print((char)a[i]+" ");
		}
}
}
