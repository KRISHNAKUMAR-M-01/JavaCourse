package OOPS.abstarction;

public class Innova extends Car{
	@Override
	public void run() {
		System.out.println("innova running very fast");
		
	}
	
	
	public static void main(String[] args) {
		Innova innova=new Innova();
		innova.run();
		
		Maruthi maruthi=new Maruthi();
		maruthi.run();
		
		Car ss=new Innova();
		ss.sleep();
		ss.run();
		
		add();
		Car.add();
		ss.add();

	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		
	}

	

}
