package javabasics;

public class Car {
	
	//home work 
	String nameOfCar = "Jaguar XJ";
	float mileage = 9.43f;
	String fuel = "Petrol or Diesel";
	String company = "Jaguar";
	int horsepower = 550;
	boolean isluxury = true;
	float capacity = 2.8f;
	int topspeed = 280;
	char anotherVersion = 'L';
	int price = 99;
	
	public static void main(String[] args) {
		//create an object of car
		Car car = new Car();
		
		//access the variable 
		float mileage = car.mileage;
		System.out.println("The mileage of car is : " + mileage);
		String fuel = car.fuel;
		System.out.println("The fuel type can be of : " + fuel);
		String nameOfCar = car.nameOfCar;
		System.out.println("The name of car is : " + nameOfCar);
		String company = car.company;
		System.out.println("The company is " + company);
		int horsepower = car.horsepower;
		System.out.println("The horsepower is " + horsepower + "HP");
		boolean isluxury = car.isluxury;
		System.out.println(isluxury);
		float capacity = car.capacity;
		System.out.println(capacity);
		int topspeed = car.topspeed;
		System.out.println("The top speed is : " + topspeed + "Km/h");
		char anotherVersion = car.anotherVersion;
		System.out.println("The version of a car is : " + anotherVersion);
		int price = car.price;
		System.out.println("The price of a car is : " + price + "Lakh");
		
	}
}
