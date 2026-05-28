package javabasics;

public class Cat {
	String name = "Oreo";
	String breed = "Munchkin";
	int legs = 4;
	int eyes = 2; 
	String bodytype = "moderate";
	boolean isshortLegs = true;
	float weight = 4;
	float price = 50000;
	
	public static void main(String[] args) {
		//create an object of cat
		Cat cat = new Cat();
		
		//access an object
		String breed = cat.breed;
		System.out.println("The breed of cat is : " + breed);
		String name = cat.name;
		System.out.println( "The name of a cat is : " + name);
		int legs = cat.legs;
		System.out.println( "The number of legs of a cat is : " + legs);
		int eyes = cat.eyes;
		System.out.println( "The number of eyes of a cat is : " + eyes);
		String bodytype = cat.bodytype;
		System.out.println("The body type is : " + bodytype);
		boolean isshortLegs = cat.isshortLegs;
		System.out.println(isshortLegs);
		float weight = cat.weight;
		System.out.println("The weight of cat is : " + weight + "kg");
		float price = cat.price;
		System.out.println("The price of cat is : " + price + "Rupees");
	}
	
}
