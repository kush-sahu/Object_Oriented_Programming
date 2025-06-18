package Exception;

public class Example8 {
   public static void main(String[] args) {
	try {
		System.out.println("Outer Try");
		try {
			System.out.println("Inner TRy block");
			System.out.print(10/0);			
		}
		catch(NullPointerException a) {
			System.out.println("NPE handled");
		}
	}
	catch(ArithmeticException a) {
		System.out.println("AE handled");
	}
}
}
