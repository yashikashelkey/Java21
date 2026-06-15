package javabasics;
import java.util.*;


public class Pattern {

	public static  void printTriangle(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
		
			System.out.println();
		}
	}
	
//	public static void whileLoopTriangle(int n) {
//		int i = 1;
//		while(i<=n) {
//			int j = 1;
//			while(j <= i) {
//				System.out.print("*");
//				j++;
//			}
//			i++;
//			System.out.println();
//		}
//	}
	
	public static void doWhileLoopTriangle(int n) {
		int i = 1;
		do {
			int j = 1;
			
			do {
				System.out.print("*");
				j++;
			} while(j <= i);
			
			System.out.println();
			i++;
		} while(i <= n);
	}
	
	
	public static void triangleStarPattern(int n) {
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n-i; j++) {
//				System.out.print("\t");
//			}
//			
//			for(int j=1; j<=i; j++) {
//				System.out.print("*\t\t");
//			}
//			
//			System.out.println();
//		}
	}
	
	public static void whileLoopTriangleStarPattern(int n) {
		int i=1;
		while(i <= n) {
			int j = 1;
			while(j <= n-i) {
				System.out.print("\t");
				j++;
			}
			
			int k = 1;
			while(k <= i) {
				System.out.print("*\t\t");
				k++;
			}
			i++;
			System.out.println();
		}
	}
	
	public static void doWhileLoopTriangleStarPattern(int n) {
		int i = 1;
		do {
			int j = 1;
			do {

				System.out.print(" ");
				j++;
				
			} while(j <= n-i);
			int k = 1;
			do {
				System.out.print("* ");
				k++;
			} while(k <= i);
			System.out.println();
		} while(i <= n);
	}
	
	
	public static void revTrianglePattern(int n) {
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=n-i; j++) {
				System.out.print("\t");
			}
			
			for(int j=1; j<=i; j++) {
				System.out.print("*\t\t");
			}
			
			System.out.println();
		}
	}
	
	public static void whileLoopRevTrianglePattern(int n) {
		int i = n;
		while(i >= 1) {
			int j = 1;
			while(j <= n-i) {
				System.out.print("\t");
				j++;
			}
			
			int k = 1;
			while(k <= i) {
				System.out.print("*\t\t");
				k++;
			}
			
			i--;
			System.out.println();
		}
	}
	
	public static void doWhileLoopRevTriangle(int n) {
		int i = n;
		do {
			
		} while(i >= 1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		int n = sc.nextInt();
		printTriangle(n);
		triangleStarPattern(n);
//		System.out.println();
//		System.out.println();
//		revTrianglePattern(n);
//		whileLoopTriangle(n);
//		whileLoopTriangleStarPattern(n);
		whileLoopRevTrianglePattern(n);
		doWhileLoopTriangle(n);
		

	}

}
