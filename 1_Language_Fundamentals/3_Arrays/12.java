/*Given 2 int arrays, a and b, each length 3, form a new array of length 2, containing their middle elements.
Solution:
*/
class Main {
	public static void main(String[] args) {
int[] array1 = {5, 2, 9};
		int[] array2 = {1, 4, 5};
		int[] array3 = new int[2];
  		
    		array3[0] = array1[array1.length/2];
    		array3[1] = array2[array2.length/2];
		System.out.print(array3[0]+" "+array3[1]);
}
}
//1-Input- [ 1, 2, 3],[ 4, 5, 6]
//2-Input- [ 7, 7, 7],[ 3, 8, 0]
//3-Input- [ 5, 2, 9],[ 1, 4, 5]
