	package selenew;
	
	public class Exception {
		
	public void m1() {
	System.out.println("m1");
	m2();
	}
	
	public void m2() {
	System.out.println("m2");
	m3();
	}

    public void m3(){
    System.out.println("m3");
    
    try {
    int i = 100/0;
    }
    catch(ArithmeticException e) {
    System.out.println("==AE is coming==");
    e.printStackTrace();
    }
    
    }
    public static void main(String[] args) {
	
    Exception EX = new Exception();
    EX.m1();
    	
    	
	}
	}


