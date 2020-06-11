/*Write a program to find the biggest number in a 3*3 array. The program is supposed to receive 9 integer numbers as command line arguments.
Solution:
*/
class Main {
	public static void main(String[] args) {
		if(args.length==9)
		{	int k=0;
			int max=Integer.MIN_VALUE;	
			int[][] a = new int[3][3]; 
		 	for(int i=0;i<3;i++)
    			{
    	    			for(int j=0;j<3;j++)
        				{
         					a[i][j]=Integer.parseInt(args[k]);
        					k++;
        				}
    			}
    	    		System.out.println("The given array is:");
    			for(int i=0;i<3;i++)
    			{
        				for(int j=0;j<3;j++)
        				{
        					System.out.print(a[i][j]+" ");
        					max=Math.max(a[i][j],max);
        				}
        					System.out.println();
  			}
  			System.out.print("The biggest number in the given array is "+max);
  		
		}
  		else
  			System.out.print("Please enter 9 integer numbers");
	}
}
