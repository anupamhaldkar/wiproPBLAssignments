/*Print a version of the given array where all the 10's have been removed. The remaining elements should shift left towards the start of the array as needed, and the empty spaces at the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and display the given array or make a new array.
Solution:
*/
class Main {
	public static void main(String[] args) {	
int[] array= {1,99,10};
		int n = array.length;
		 int[] result = new int[n];
  		int j = 0;
  		for(int i = 0; i < n; i++) 
{
    			if(array[i] != 10)
{
      				result[j] = array[i];
      				j++;
    			}
}
  
 		for(int i = j; i < n; i++) {
    		result[i] = 0;
 	 	}
		for (int i:result) {
			System.out.print(i+" ");
		}
}
}
//1. Input – 10, 3, 6, 10, 2, 7, 9
//2. Input – 1, 10, 10, 2
//3. Input – 10, 2, 10
//4. Input – 1, 99, 10
