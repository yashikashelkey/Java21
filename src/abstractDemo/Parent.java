package abstractDemo;

public abstract class Parent {
	abstract void carrer();
	abstract void partner();
	
	public static void main(String[] args) {
		Son son = new Son();
		son.carrer();
		
		Daughter daughter = new Daughter();
		daughter.carrer();
	}
}
