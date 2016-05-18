package challenges;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FizzBuzz {

	public static void main(String[] args) throws IOException{
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		
		while((line = buffer.readLine()) != null){
			line = line.trim();
			String[] values =  line.split(" ");
			int f = Integer.parseInt(values[0]);
			int b = Integer.parseInt(values[1]);
			int range = Integer.parseInt(values[2]);
			StringBuilder sb = new StringBuilder();
			for(int i = 1;i<=range;i++){
				if(i % f == 0){
					sb.append("F ");
				}
				else if(i % b == 0){
					sb.append("B " );
				}
				else if(i % f == 0 && i % b == 0){
					sb.append("FB ");
				}
				else{
					sb.append(i +" ");
				}
			}
			System.out.println(sb.toString().replaceAll("\\s+$", ""));
		}
	}
}
 