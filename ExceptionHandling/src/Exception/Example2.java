package Exception;

import javax.crypto.AEADBadTagException;

public class Example2 {
public static void main(String[] args) {
	try {
		String str=null;
		str.charAt(0);
		
	}
	catch(ArithmeticException a ){
		System.out.println("AE handled");
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.print("AIOBEH");
	}
	catch(RuntimeException a) {
		System.out.print("Exception is handled");
	}
}
}
