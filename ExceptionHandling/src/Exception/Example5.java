package Exception;

public class Example5 {
public static void main(String[] args) throws Exception{
	try {
		System.out.println("Try block");
		Thread.sleep(3000);
		System.out.println(10/0);
		System.out.println(args[0]);
		System.out.println("Java");
	}
//	catch(InterruptedException a) {
//		System.out.println("IE handled");
//	}
	catch(ArithmeticException a){
		System.out.println("AE handled");
	}
	catch(NullPointerException a) {
		System.out.println("NpE handled");
	}
	}
}
		
