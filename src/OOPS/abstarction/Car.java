package OOPS.abstarction;

public abstract class Car {
	private int a;
	private int b;
	
	Car(){
		System.out.println("car called");
	}

	public void sleep() {
		System.out.println("sleeping");
	}
	
	public static void add() {
		System.out.println("addition");
	}
	
	public abstract void run() ;
	
	public abstract void shutdown();

}
