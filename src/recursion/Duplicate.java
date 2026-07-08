package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> list = new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(6);
		list.add(1);
		list.add(2);
		list.add(17);
		list.add(4);
		list.add(89);
		list.add(20);
		Collections.sort(list);
		System.out.println(list);
		findDuplicate(list);
	}

	static void findDuplicate(List<Integer> list ) {
		//Collections.sort(list);
		int count = 1;
		int length = list.size();
		for(int i=0; i<length; i++) {
			for(int j=i+1; j<length; j++) {
				if(list.get(i).equals(list.get(j))) {
					count++;
				}
			}
		}
	}
}
