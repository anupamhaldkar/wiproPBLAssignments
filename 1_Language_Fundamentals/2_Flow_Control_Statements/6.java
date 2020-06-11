/*Initialize a character variable in a program and 
print 'Alphabhet' if the initialized value is an alphabhet, 
print 'Digit' if the initialized value is a number, and 
print 'Special Character', if the initialized value is anything else.
Solution:
*/
class Main {
	public static void main(String[] args) {
		char a = 'j';
		
		if(a>=65&&a<=92||a>=97&&a<=122)
			System.out.print("Alphabet");
		else if(a>=48&&a<=57)
			System.out.println("Digit");
       		 else
           			 System.out.println("Special Character");	
	}
}

