package OOPS.Interface;

public class UpiPayment implements Payment{
	private int amount;
    
    
	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public void pay(int amount) {
		System.out.println("paid" + amount +"amount using upi");			
	}

}
