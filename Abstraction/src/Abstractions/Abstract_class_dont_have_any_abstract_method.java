package Abstractions;

abstract class Parent{
	public String check() {
		return "This is just to check";
	}
}
class Child extends Parent {
	@Override
	public String check() {
		return "This is child";
	}
}
public class Abstract_class_dont_have_any_abstract_method {
	public static void main(String[] args) {
		 Parent obj=new Child();
		 System.out.println(obj.check());
		  	
	}
 
}
