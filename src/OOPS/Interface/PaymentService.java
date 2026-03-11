package OOPS.Interface;

public class PaymentService {

	// interface type is payment
	public void process(Payment payment, int amount) {
		payment.pay(amount);
	}
	
	public static void main(String[] args) {
		PaymentService service =new PaymentService();
		
		CreditCardPayment card=new CreditCardPayment();
		card.setAmount(100);
		service.process(card,card.getAmount());
		
		UpiPayment upi=new UpiPayment();
		upi.setAmount(200);
		service.process(upi,upi.getAmount());
		
//		AtmPayment atmPayment=new AtmPayment();
//		service.process(atmPayment);
	}
}
