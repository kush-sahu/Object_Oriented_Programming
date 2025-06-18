package Exception;

public class Example7 {

public static void main(String[] args) {
   try {
    	System.out.print(10%0);
     }
   catch(ArithmeticException a) {
	    System.out.print("AE handled");
	    // this is the exception but it is inside catch block and we can handled only the exception present inside the try block thats why we get null pointer exception 
        Example7 obj=null;
        obj.m1();
    }
   catch(NullPointerException a) {
	   System.out.print("NPE handled");
   }
}
public void m1() {}

}