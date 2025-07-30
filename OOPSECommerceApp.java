class PaymentGateway {
	
	public void makePayment(String cardNumber, String expiryDate, int cvv) {
		System.out.println("Make Payment Through Card");
		System.out.println("Transaction Successful Using Card!! " + cardNumber);
	}
	
	public void makePayment(String upiID) {
		System.out.println("Make Payment Through UPI");
		System.out.println("Transaction Successful Using UPI!! " + upiID);
	}
	
	public void makePayment(double amount) {
		System.out.println("Make Payment Through Cash");
		System.out.println("Transaction Successful Using Cash!! " + amount);
	}
}
public class OOPSECommerceApp {
	public static void main(String[] args) {
		PaymentGateway p1 = new PaymentGateway();
		
		p1.makePayment("4213 5869 1235 7569", "07/28", 707);
		System.out.print("\n");
		
		p1.makePayment("hsddhvb25481");
		System.out.print("\n");
		
		p1.makePayment(50000.00);
	}
}
