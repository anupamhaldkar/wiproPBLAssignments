/*Write a Program to check whether a given String is Palindrome or not.

 Solution:
 */
import java.util.*;
class Palindrome{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String a = sc.nextLine();
	    	int flag=0;
	    for (int i=0,j=a.length()-1;i<j ;j--,i++ ) {
	    	if(a.charAt(i)!=a.charAt(j)){
	    		flag=1;
	    		break;
	    	}
	    }

	System.out.print(flag==1?"Not Palindrome": "Palindrome");
        }
}
