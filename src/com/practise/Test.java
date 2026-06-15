package com.practise;

public class Test {
	
	void details(Bottle bottle) {
		System.out.println(bottle.getName());
	}
	public static void main(String[] args) {
		Bottle obj = new Bottle();
		obj.setName("Milton Bottle");
		Test t = new Test();
		t.details(obj);
		
	}
	
}
