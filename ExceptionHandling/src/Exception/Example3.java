package Exception;

import javax.crypto.AEADBadTagException;

public class Example3 {
public static void main(String[] args) {
	try {
		System.out.print(10/0);
		
	}
	catch(ArithmeticException a ){
		System.out.println("AE handled");
	}
	catch(NullPointerException e) {
		System.out.print("NPE handled");
	}
//	catch(InterruptedException e) {
//		System.out.print("IEH");
//	}
	//CTE
	//when we declared a catch block for the checked exception and the exception is not occur inside the try block then we get an error called as unresolved compilation problem 
  }
}
