/*Print an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and print the given array, or make a new array.
Solution:
*/
class Main {
	public static void main(String[] args) {
				
		int[] array1= {1, 0, 1, 0, 0, 1, 1};
		int n = array1.length;
		int even = 0;
  		int odd = n-1;
  		int[] array2 = new int[n];
  		for (int i = 0; i < n; i++) 
{
    			if (array1[i] % 2 == 0) 
{
      				array2[even] = array1[i];
      				even++;
    			} 
    			else 
{
      				array2[odd] = array1[i];
      				odd--;
    			}	
    		}
		for (int j:array2)	
			System.out.print(j+" ");
}
}
//1. Input –[ 10, 3, 6, 1, 2, 7, 9]
//2. Input –[ 3, 3, 2]
//3. Input – [1, 0, 1, 0, 0, 1, 1]
