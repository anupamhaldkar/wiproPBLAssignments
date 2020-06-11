/*Write a program to accept gender ("Male" or "Female") and age from command line arguments and print the percentage of interest based on the conditions.
Solution:
*/
class Main {
	public static void main(String[] args) {
		float i = 0.0f;
		int age = Integer.parseInt(args[1]);
		if(args[0].equals("Female"))
		{
			if((age>=1)&&(age<=58))
				i=8.2f;
			else
				i=9.2f;
		}
		else 
		{	if((age>=1)&&(age<=58))
				i=8.4f;
			else
				i=10.5f;
		}
            	System.out.println("Percentage of interest "+i+"%");	
	}
}
