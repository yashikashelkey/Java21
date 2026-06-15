package javabasics;
import java.io.*;

class A {
	public int marks = 6;
}

public class Student {
//	String name = "Yashika";//string ki tarah behave literal
//	int collegeId = 123456;
//	char section = 'A';
//	String branch = "CSE";
//	boolean isMarried = false;
//	String city = new String ("Bhopal");//string object 
//	int age = 20;
//	int phoneNumber = 12367;
//	String course = "";
	private String name;
	private String course;
	private int id;
	private int roll;
	

//	public static void main(String[] args) {
	
	

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the roll
	 */
	public int getRoll() {
		return roll;
	}

	/**
	 * @param roll the roll to set
	 */
	public void setRoll(int roll) {
		this.roll = roll;
	}

	private void main () {
		//File file = new File("");
		// create an object of student type
		
		A obj = new A();
		
//		int marks = obj.marks;
//		System.out.println(marks);
		//Student student = new Student();
		// access the variable
//		String name = student.name;
//		System.out.println(name);
//		int collegeId = student.collegeId;
//		System.out.println(collegeId);
//		String city = student.city;
//		System.out.println(city);
//		int phoneNumber = student.phoneNumber;
//		System.out.println(phoneNumber);
//		String branch = student.branch;
//		System.out.println(branch);
//		boolean isMarried = student.isMarried;
//		System.out.println(isMarried);
//		int age = student.age;
//		System.out.println(age);
//		char section = student.section;
//		System.out.println(section);
	}
	
	void register(int id, int roll, String name, String course) {
		this.name = name;
		this.roll = roll;
		this.id = id;
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + ", id=" + id + ", roll=" + roll + "]";
	}

	public static void main(String[] args) {
		Student student = new Student();
		student.register(01, 213, "Yashika", "Java");
		System.out.println(student);
		//student.main();
	}
}
