package recursion;

public class Question2 {
	public static void main(String[] args) {
		StringBuilder input = new StringBuilder("yashika"); 
		revString(input);
	}
	
	static char revString(StringBuilder input2) {
		StringBuilder input = input2;
		int totalLength = input.length();
		if(totalLength == 0) {
			return input.charAt(totalLength - 1);
		}
		
		return revString(input.deleteCharAt(totalLength - 1));
	}
}