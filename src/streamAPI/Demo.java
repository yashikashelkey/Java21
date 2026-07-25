package streamAPI;
import java.util.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<int []> list =  new ArrayList<>();
		int count = 0;
		
		while(true) {
			list.add(new int[250000]); //int => 4 byte ! Million !mb
			count++;
			System.out.println("Allocated Block : " + count);
		}
	}

}
