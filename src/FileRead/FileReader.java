package FileRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) {
		FileReader fileRead = new FileReader();
		fileRead.write();
		fileRead.read();
    }
	
	
	public void write() {
		File file = new File("index.txt");
		Scanner sc =  new Scanner(System.in);
		
		try {
			FileWriter fileWriter = new FileWriter(file, true);
		
		
		    System.out.println("Enter the line to be written in the code");
		    while(sc.hasNextLine()) {
			   String s = sc.nextLine();
			   if(s.equals("EOF")) {
				   break;
			   }
			   fileWriter.write(s + "\n");
		}
		fileWriter.close();
		
		}  catch (IOException e) {
		
		e.printStackTrace();
        }
    }
	
	public void read() {
		File file = new File("index.txt");

		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
}