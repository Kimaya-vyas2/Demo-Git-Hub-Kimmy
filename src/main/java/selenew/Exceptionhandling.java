	package selenew;
	
	public class Exceptionhandling {
		
	String name;
	
	public static void main(String[] args) {
				
	Exceptionhandling Nu = new Exceptionhandling();                        // create object of class Null
	
	System.out.println("A---B---C");
	
    System.out.println("X---Y---Z");

    System.out.println("1---2---3");
    
    String x = null;
    
    try {
    Nu = null;
    Nu.name = "Umesh";

    
    int a = 9/0;                                                    // Run time exception code
    
		
    }
    
    catch(ArithmeticException e) {
    System.out.println("==AE exception is comimg==");	

    e.printStackTrace();
    }
	
    catch(NullPointerException e) {
    System.out.println("Null--pointer--exception");
    e.printStackTrace();
    }
    
    System.out.println("==Program continues==");
	}
	
	}
