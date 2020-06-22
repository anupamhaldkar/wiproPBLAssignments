import java.util.*;
import java.io.*;
public class Answer3 {
	public static void main(String[] args) throws IOException
	{ 
		BufferedReader br = new BufferedReader(new FileReader("inputFile.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("outputFile.txt"));
		
		String s = br.readLine();
		Map<String, Integer> map = new TreeMap<>();
		while(s!=null)
		{
			s=s.trim();
			String[] word = s.split(" ");
			for(String w: word)
			{
				if(!map.containsKey(w))
				{
					map.put(w,1);
				}
				else
				{
					map.put(w,map.get(w)+1);
				}
			}
			
			s = br.readLine();
		}
		System.out.println(map);
		
		
		for(Map.Entry m:map.entrySet())
		{  
		  bw.write(m.getKey() + " : " + m.getValue() + "\n");
		}
		bw.flush();
	}		
}
