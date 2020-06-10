/*Write a program to initialize an array and print them in a sorted order.
Solution:
*/
class Main {
	public static void main(String[] args) {
int[] array= {65,69,73,77,104,83,85};
		for (int i = 0; i < array.length - 1; i++) 
		{
			for (int j = 0; j < array.length - i - 1; j++) 
			{
				if (array[j] > array[j + 1])
 {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		for(int i:array)
		System.out.print(i+" ");		

	}
}
