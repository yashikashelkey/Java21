package List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*	    ArrayList <Integer> num = new ArrayList<Integer>();
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(0, 7);
		num.add(1, 9);
		num.remove(0);
		num.set(2, 20);
		System.out.println(num);
		System.out.println(num.size()); */
		
		//Linked list concept
//		LinkedList <Integer> list = new LinkedList<Integer>();
//		list.add(23);
		
		//practise through youtube
		//ArrayList list = new ArrayList();
		
		//Upcasting
		String s = "Hello";
		Object obj = s;
		System.out.println(obj);
		
		//Downcasting
		Object obj2 = "Yashika";
		String s2 = (String) obj2;
		System.out.println(s2);
		
		//Downcasting is dangerous
		Object obj3 = 10;
		String s3 = (String)obj3;
		System.out.println(s3);
	}
		
}
