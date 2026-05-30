package javabasics;

public class Perfume {
	String name = "BERGAMOT BEAUTE VALENTINE PERFUME";
	String brand = "BERGAMOT BEAUTE";
	float price = 175;
	int quantity = 30;
	boolean isPocketPerfume = true;
	String fragranceClassification = "Perfume";
	boolean isOrganic = false;
	String fragranceFamily = "Floral or Fruity";
	int packOf = 2;
	int maxShelflife = 3;
	String idealFor = "Women";
	
	public static void main(String[] args) {
		Perfume perfume = new Perfume();
		String name = perfume.name;
		System.out.println("The name of perfume  " + name);
		String brand = perfume.brand;
		System.out.println("The brand is : " + brand);
		float price = perfume.price;
		System.out.println("The price is : " + price + "Rupees");
		int quantity = perfume.quantity;
		System.out.println(quantity + "ml");
		boolean isPocketPerfume = perfume.isPocketPerfume;
		System.out.println(isPocketPerfume);
		String fragranceClassification = perfume.fragranceClassification;
		System.out.println("The fragrance" + fragranceClassification);
		boolean isOrganic = perfume.isOrganic;
		System.out.println(isOrganic);
		String fragranceFamily = perfume.fragranceFamily;
		System.out.println("The fragrance family : " + fragranceFamily);
		int packOf = perfume.packOf;
		System.out.println(packOf);
		int maxShelflife = perfume.maxShelflife;
		System.out.println(maxShelflife);
		String idealFor = perfume.idealFor;
		System.out.println(idealFor);
	}
}
