package recursion;

public class Question2 {
	public static void main(String[] args) {
		StringBuilder input = new StringBuilder("yashika"); 
		revString(input);
	}
	
	static void revString(StringBuilder input2) {
		StringBuilder input = input2;
		int totalLength = input.length();
		if(totalLength == 0) {
			return;
		}
		System.out.print(input.charAt(totalLength - 1));
		revString(input.deleteCharAt(totalLength - 1));
	}
}