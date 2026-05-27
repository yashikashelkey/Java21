package javabasics;

public class Student {
	String name = "Yashika";
	int collegeId = 123456;
	char section = 'A';
	String branch = "CSE";
	boolean isMarried = false;
	String city = "Bhopal";
	int age = 20;
	int phoneNumber = 12367;

	public static void main(String[] args) {
		// create an object of student type
		Student student = new Student();
		// access the variable
		String name = student.name;
		System.out.println(name);
		int collegeId = student.collegeId;
		System.out.println(collegeId);
		String city = student.city;
		System.out.println(city);
		int phoneNumber = student.phoneNumber;
		System.out.println(phoneNumber);
		String branch = student.branch;
		System.out.println(branch);
		boolean isMarried = student.isMarried;
		System.out.println(isMarried);
		int age = student.age;
		System.out.println(age);
		char section = student.section;
		System.out.println(section);
	}
}
