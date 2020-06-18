/*Write a program to accept name and age of a person from the command prompt(passed as arguments when you execute the class) and ensure that the age entered is >=18 and < 60. 
Display proper error messages. 

The program must exit gracefully after displaying the error message in case the arguments passed are not proper.
 (Hint : Create a user defined exception class for handling errors.)
 Solution:
 */
class InvalidAgeException extends Exception {
	InvalidAgeException(){
		System.out.println("Invalid age");
	}
}

class Valid {
	public static void main(String[] args)  
	{
		try 
		{
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		if (age < 18 || age >= 60)
			throw new InvalidAgeException();
		System.out.println("Name " + name + " Age " + age);
	}
	catch(NumberFormatException e) {
		System.out.println(e);
	} catch (InvalidAgeException e) {
		
		
	}

	}
}
