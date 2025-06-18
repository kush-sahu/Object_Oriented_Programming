package Exception;

public class Example6 {
static {
	try {
		System.out.print(10%0);
	}
	catch(ArithmeticException a) {
		System.out.print("AE handled");
	}
	System.exit(0);
}
public static void main(String[] args) {}

}
