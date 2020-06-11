/*Write a program to print prime numbers between 10 and 99.
Solution:
*/
class Main {
	public static void main(String[] args) {
		for (int i=10;i<99 ;i++ ) 
		{	int flag=0;
			for(int j=2;j<=Math.sqrt(i);j++)
				{
					if(i%j==0)
					{	flag=1;
						break;
					}

				}
			if(flag!=1)
			System.out.print(i+" ");
		}
	}
}
