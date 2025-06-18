package Exception;

public class Example4 {
	public static void main(String[] args) {
		try {
			System.out.print(10/0);
		}
		catch(ArithmeticException a) {
			System.out.println("AE handled");
		}
		catch(NullPointerException n) {
			System.out.println("NPE handled");
		}
//		catch(InterruptedException e) {
//			System.out.print("NPE handled");
//		}
		
	}
}
