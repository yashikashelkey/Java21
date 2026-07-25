package stream;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) {
//		int x = System.in.read();
//		
//		System.out.println((char)x);
		
		//create file
		try {
		  File file = new File("/Users/yashi/codewithclarity/code/Java21/src/stream/first.txt");
		  FileWriter writer = new FileWriter(file);
		  writer.write("my first line to write :)");
		  writer.close();
		  System.out.println("Successfully wrote to the file");
		} catch(IOException e) {
			System.out.println("An error");
			e.printStackTrace();
		}
		
//		try {
//			//BufferedWriter br =  new BufferedWdfriter(new FileWriter(file, true));
//			
//			System.out.println("Enter the line to be written by bufferWriter");
//			
//			
//		}
	}

}
