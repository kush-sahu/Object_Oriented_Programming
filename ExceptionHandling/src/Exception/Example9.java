package Exception;

public class Example9 {
      Example9(int n1,int n2) {
	   System.out.println(n1/n2);
	}
      public static void main(String[] args) {
		try {
			Example9 obj=new Example9(10,0);
		}
		catch(ArithmeticException a) {
          System.out.print("AE handled");
		}
	}
}
