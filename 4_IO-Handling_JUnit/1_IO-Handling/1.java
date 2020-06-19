import java.util.*;
import java.io.*;
class CountInsensitive {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name");
		String s = sc.next();
		System.out.println("Enter the character to be counted");
		char c = sc.next().charAt(0);
		FileInputStream fis = new FileInputStream(s);
		int a;
		int count = 0;
		while((a=fis.read())!=-1){
			if(c>91){
				if(c==a || c == a+32)
					count++;
			} 
			else{
				
				if(c==a || c == a-32)
					count++;
					
			}
		}
		System.out.println("File "+s+" has "+ count +" instances of letter "+ c);
		Fis.close();
		Sc.close();
	}
}
