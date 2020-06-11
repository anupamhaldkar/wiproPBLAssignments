/*Write a program to remove the duplicate elements in an array and print the same.
Solution:
*/
class Main {
	public static void main(String[] args) {
				
		int[] array= {65,77,69,73,77,77,104,83,85};
		int n = array.length;
		for (int i = 0; i < n ; i++) 
		{
			for (int j = i+1; j < n; ) 
			{
				if (array[j] == array[i]) {
					for (int temp=j;temp<n-1 ;temp++ ) 
						array[temp]=array[temp+1];
					n=n-1;a	
				}
				else 
					j++;
			}
			
		}
		for(int i=0;i<n;i++)
		System.out.print(array[i]+" ");		
}
}
