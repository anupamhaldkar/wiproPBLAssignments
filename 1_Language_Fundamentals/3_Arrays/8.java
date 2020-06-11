/*Write a program to print the sum of the elements of an array following the given below condition.
Solution:
*/
class Main {
	public static void main(String[] args) {
int[] array= {10,3,6,1,2,7,9};
		int n = array.length;
		int six=-1;
		int seven =-1;
		int sum=0;
		for (int i = 0; i < n ; i++) 
		{	if(array[i]==6)
				six=i;
			if(array[i]==7) 
				seven=i;
		}
		if(six==-1)
			seven=-1;
		for (int i=0;i<n ;i++ ) {
			if(seven!=-1&&i>=six&&i<=seven)	
				continue;
			sum+=array[i];		
		}		
		System.out.println(sum);
}
}

//1. Input  – 1,6,4,7,9
//2. Input  – 10,3,6,1,2,7,9
