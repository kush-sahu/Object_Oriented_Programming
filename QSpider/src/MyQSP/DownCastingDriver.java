package MyQSP;
import java.util.*;
class Product{
	String name;
	String pid;
	double price;
	public Product(String name,double price) {
		this.name=name;
		this.price=price;
	}
	public void displayProd() {
		System.out.print("Name :"+name +"price :"+price);
	}
}
class User{
	String name="Kush Sahu";
	String email="kushsahu144114@gmail.com";
	long phone=884389394;
	public User(String name,String email,long ph) {
		// TODO Auto-generated constructor stub
	
		this.name=name;
		this.email=email;
		phone=ph;
	}
	public void displayUser() {
		System.out.print("Name :"+name);
		System.out.println("Email :"+email);
	    System.out.println("Phone Numer :"+phone);
	}
}
class Payment extends User{

	public Payment(String name, String email, long phone) {
        super(name, email, phone); // Call to User constructor
    }


	public void checkMethod(Payment pay) {
		if(pay instanceof PhonePay) {
			System.out.print("Redirect to Phone Pay");
			PhonePay obj=(PhonePay)pay;
			obj.paymentopt();
		}else if(pay instanceof GPay) {
			System.out.print("Redirect to Phone Pay");
			GPay obj=(GPay)pay;
			obj.paymentopt();
		}else {
			System.out.print("Redirect to Phone Pay");
			PayTm obj=(PayTm)pay;
			obj.paymentopt();
		}
	}
}
class GPay extends Payment{
	Product prod;
 GPay(Product prod){
		this.prod=prod;
	}
	public void paymentopt() {
		displayUser();
		System.out.println("Pay to Gpay");
		prod.displayProd();
	}
}
class PhonePay extends Payment{
	Product prod;
 PhonePay(Product prod){
		this.prod=prod;
	}
	public void paymentopt(){
		displayUser();
		System.out.println("Pay to Phonepay");
		prod.displayProd();
	}
}
class PayTm extends Payment{
	Product prod;
 PayTm(Product prod){
		this.prod=prod;
	}
	public void paymentopt(){
		displayUser();
		System.out.println("Pay to PayTm");
		prod.displayProd();
	}
}
class Flipkart {
	public void checkout(Product prod){
	    
		Payment payment=null;
		for(;;) {
			System.out.println("Payment Options");
			System.out.print(" 1 PhonePay");
			System.out.print(" 2 GPay");
			System.out.print(" 3 PayTm");
			System.out.print(" 4 COD");
			int opt=new Scanner(System.in).nextInt();
			switch (opt) {
			case 1: {
				
				payment=new PhonePay(prod);
				payment.checkMethod(payment);
				break;
			}
            case 2: {
 				
				payment=new GPay(prod);
				payment.checkMethod(payment);
				break;
			}
             case 3: {
	
	            payment=new PayTm(prod);
               	payment.checkMethod(payment);
            	break;
              }
             case 4: {
	
            	System.out.print("Keep your case ready ");
            	break;
        
             }
			
		}
	}
}
}
public class DownCastingDriver {
    public static void main(String[] args) {
		Product prod=new Product("Duster",100);
		Flipkart obj=new Flipkart();
		//obj.checkout(prod);
	}

	
}
