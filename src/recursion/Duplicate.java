package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> list = Arrays.asList(1,2,4, 17,89,6,1,20,2,4);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		findDuplicate(list);
	}

	static void findDuplicate(List<Integer> list ) {
		//Collections.sort(list);
		
		int length = list.size();
		for(int i=0; i<length; i++) {
			int count = 1;
			for(int j=i+1; j<length; j++) {
				if(list.get(i).equals(list.get(j))) {
					count++;
				}
			}
			
			if(count > 1) {
				System.out.println(list.get(i) + " occurs " + count + " times ");
			}
		}
	}
}
