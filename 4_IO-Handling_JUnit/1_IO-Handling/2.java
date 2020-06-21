import java.util.*;
import java.io.*;
class Copied {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input file name");
		String file1 = sc.next();
		System.out.println("Enter the output file name");
		String file2 = sc.next();
		FileInputStream fis = new FileInputStream(file1);
		FileOutputStream fos = new FileOutputStream(file2);
		int a;
		while((a=fis.read())!=-1){
			fos.write(a);
		}
		System.out.println("File is Copied.");
		fos.close();
		fis.close();
		sc.close();
	}
}
