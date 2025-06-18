package Exception;

class Demo{
	@Override
	@SuppressWarnings("removal")
	public void finalize()throws Throwable{
		System.out.println("Finalize Starts");
		System.out.println("object get destroyed");
		System.out.println(10/0);
		super.finalize();
		System.out.print("Finalize ends");
	}
}
public class FinalizeExample {
    
    	public static void main(String [] args) {
    		System.out.println("mail start");
    		Demo obj=new Demo();
    		obj=null;
    		System.gc();
    		System.out.println("mail Ends");
    	}
    
	
}
