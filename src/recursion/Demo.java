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
			//return reverse(num / 10, rev * 10 + num % 10); ;
		}
		int revNum = 0;
		int lastDigit = num % 10;
		revNum = revNum *  10 + lastDigit;
		System.out.print(revNum);
		revOfNumber(num / 10);
	}

}

//public class Main {
//
//    static int reverse(int num, int rev) {
//
//        if (num == 0) {
//            return rev;
//        }
//
//        return reverse(num / 10, rev * 10 + num % 10);
//    }
//
//    public static void main(String[] args) {
//
//        int num = 12345;
//
//        int ans = reverse(num, 0);
//
//        System.out.println("Original Number: " + num);
//        System.out.println("Reversed Number: " + ans);
//    }
//}
