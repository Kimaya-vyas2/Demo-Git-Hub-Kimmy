	package selenew;
	
	public class Amatestrycatch {
    
	public void search() {
	System.out.println("Search");
	cart();
	}
		
	public void cart() {
	System.out.println("Cart");
	bankpayment();
	}
		
	public void bankpayment() {
	System.out.println("Bankpayment");	
		
	try {
	int a = 100/0;
	}
	catch(ArithmeticException e) {
	System.out.println("==AE is coming==");
	e.printStackTrace();
	}
	catch(NullPointerException e) {
	System.out.println("==NPE is coming==");
	e.printStackTrace();
	}
	}
	
	public static void main(String[] args) {
	
	Amatestrycatch AZ = new Amatestrycatch();
	AZ.search();
	
	}
	}
	