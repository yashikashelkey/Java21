package recursion;
import java.util.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number: ");
//		try (Scanner sc = new Scanner(System.in)) {
//			int input = sc.nextInt();
//			
//			revOfNumber(input);
//		} catch {

	}
	
	public static void revOfNumber(int input) {
		int num = input;
		
		if(num == 0) {
			return ;
		}
		int revNum = 0;
		int lastDigit = num % 10;
		revNum = revNum *  10 + lastDigit;
		System.out.print(revNum);
		revOfNumber(num / 10);
	}

}
