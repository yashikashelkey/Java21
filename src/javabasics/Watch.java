package javabasics;

public class Watch {
	String name = "BENYAR Analog Watch";
	String brand = "BENYAR";
	float price = 2990;
	int dialSize = 45;
	boolean isWaterResistance = true;
	int packOf = 1;
	String watchType = "Chronographs";
	String color = "Blue";
	int NetQuantity = 100;
	String idealFor = "Men";
	
	public static void main(String[] args) {
		Watch watch = new Watch();
		String name = watch.name;
		System.out.println("The name of watch : " + name);
		String brand = watch.brand;
		System.out.println("The brand name is : " + brand);
		float price = watch.price;
		System.out.println("The price of watch : " + price);
		int dialSize = watch.dialSize;
		System.out.println("The dialsize is : " + dialSize + "mm");
		boolean isWaterResistance = watch.isWaterResistance;
		System.out.println(isWaterResistance);
		int packOf = watch.packOf;
		System.out.println(packOf);
		String watchType = watch.watchType;
		System.out.println("The type of watch : " + watchType);
		String color = watch.color;
		System.out.println("The color of watch : " + color);
		int netQuantity = watch.NetQuantity;
		System.out.println(netQuantity);
		String idealFor = watch.idealFor;
		System.out.println("Is ideal for : " + idealFor);
	}
}	
