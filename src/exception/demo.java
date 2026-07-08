package exception;

import java.io.File;
import java.io.IOException;

public class demo {

	public static void main(String[] args) {
		new demo().display();
		System.out.println("display method executed successfully");
	}
	
	public void display() {
		try {
			System.out.println("below line will execute");
			String s = null;
			s = s.concat("abcd");
			System.out.println(s);
			System.out.println(5 / 0);
			System.out.println("above line did not executed");
		}   catch (ArithmeticException  | NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getCause());
			System.out.println("Exception handled");
			
			
			e.getStackTrace();
		}
	}
}
