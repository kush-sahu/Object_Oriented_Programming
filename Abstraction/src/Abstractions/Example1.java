package Abstractions;

abstract class  Parent{
	public void m1();
	public void m2();
}
class A extends Parent{
	public void abstract m1() {
		System.out.println("from m1 class A");
	}
}
public void abstract m2() {}

class B extends Parent {
	public void abstract m1() {}
	public void abstract m2() {}
}

public class Example1 {
  public static void main(String[] args) {
	Parent obj1=new A();
	obj1.m1();
	obj1.m2();
	Parent obj2=new B();
	obj2.m1();
	obj2.m2();
  }
}
