package javabasics;

public class Test {

	void register(StudentBean studentBean) {
		System.out.println(studentBean.getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentBean student = new StudentBean();
		student.setName("Yashika");
		
		Test t = new Test();
		t.register(student);
	}

}
