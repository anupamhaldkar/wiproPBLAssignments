/*Initialize a character variable with an alphabhet in a program.
If the character value is in lowercase, the output should be displayed in uppercase in the following format.
If the character value is in uppercase, the output should be displayed in lowercase in the following format.
Solution:
*/
class Main {
	public static void main(String[] args) {
		char b = 'e';
		if(Character.isLowerCase(b)){
			System.out.println(b+"->"+Character.toUpperCase(b));
			}
		else
           			 System.out.println(b+"->"+Character.toLowerCase(b));
		
	}
}
