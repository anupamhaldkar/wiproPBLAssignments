/*Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as Command Line arguments.
Solution:
*/
class Main {
	public static void main(String[] args) {
		if(args.length==4)
		{	int k=0;	
			int[][] a = new int[2][2]; 
		 	for(int i=0;i<2;i++)
    			{
    	    			for(int j=0;j<2;j++)
        				{
         					a[i][j]=Integer.parseInt(args[k]);
        					k++;
        				}
    			}
    	    		System.out.println("The given array is:");
    			for(int i=0;i<2;i++)
    			{
        				for(int j=0;j<2;j++)
        				{
        					System.out.print(a[i][j]+" ");
        				}
        				System.out.println();
  			}
  			System.out.println("The reverse of array is:");
    			for(int i=1;i>=0;i--)
    			{
        				for(int j=1;j>=0;j--)
        				{
        					System.out.print(a[i][j]+" ");
        				}
        					System.out.println();
	        		}
		}
  		else
  			System.out.print("Please enter 4 integer numbers");
	}
}
