package Abstractions;

abstract class Parentee {
	String name;
	int number;
	Parentee(String s,int n){
		name=s;
		number=n;
		System.out.println("parent Class constructor initialized =="+name+":"+number);
	}
	
}
class ParenteeChild extends Parentee{
	public ParenteeChild(String n, int m) {
		super(n,m);
		System.out.println("Child Class constructor passed vslue to the parent class constructor =="+m+":"+n);
	}
}
abstract class Demo{
	{
		System.out.println("NonStaticBlock");
	}
	public abstract void met() ;
	
}
class Chil extends Demo{
	@Override
	public void met() {
		System.out.println("Abstract method override");
	}
}
public class AbstractClass_Constructor {

	public static void main(String[] args) {
		Demo obj=new Chil();
		obj.met();
        Parentee obj1=new ParenteeChild("Kush SAhu", 002);
        
	}

}
