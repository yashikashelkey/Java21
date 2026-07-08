package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo1 {
	public static void main(String[] args) {
		try {
			checkEligibility(-5);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
			System.out.println("Entered age was : " + e.getAge());
		}
		
	}
	
	public static void checkEligibility(int age) throws InvalidAgeException {
		if(age <= 0) {
			throw new InvalidAgeException("Age cannot be negative", age);
		}
		
		if(age > 18) {
			System.out.println("You are eligible to vote");
		}
	}
}

//checked exceptions --> throws concept

class InvalidAgeException extends Exception {
	private int age;
	
	public InvalidAgeException(String message, int age) {
		super(message);
		this.age = age;
	}
	
	public int getAge() {
		return  this.age;
	}
}