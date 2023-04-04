package Practice.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIODemo {

	public static void main(String[] args) {
		
		try {
			
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("File.txt"));
			bufferedWriter.write("Hello World.");
			bufferedWriter.write("\nLine 1");
			
			bufferedWriter.close();
						
			System.out.println("Done.");
			
//			FileOutputStream fout = new FileOutputStream("File.txt");
//			fout.write(65);
//			fout.close();
			
			
			BufferedReader bufferedReader = new BufferedReader(new FileReader("File.txt"));
//			String string;
//			while((string = bufferedReader.readLine()) != null) {
//				System.out.println(string);
//			}
			
			int ch;
			while((ch = bufferedReader.read()) != -1) {
				System.out.print((char)ch);
			}
			
			bufferedReader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
