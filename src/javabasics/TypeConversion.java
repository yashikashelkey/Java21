package javabasics;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Implicit Conversion
		//(byte to int)
		byte b = 65;
		int i = b;
		System.out.println(i);
		
		//character to int 
		char c = 'a';
		int x = c;
		System.out.println(x);
		
		//explicit conversion
		int num1 = 300;
		byte j;
		j = (byte) num1;
		System.out.println(j);
		
		long a = 234;
		int d = (int)a;
		System.out.println(d);
		
		//truncating conversion in Java
		float f = 15.678f;
		int r = (int) f;
		System.out.println(r);
		
		//Boolean to any datatype
		//These conversion are not possible in java 
		
		byte q = 50;
		q = (byte) (q * 2);
		System.out.println(q);
		
		//bitwise operator in java 
		//they works on bit 
		int z = 5<<2;
		System.out.println(z);
	}

}
