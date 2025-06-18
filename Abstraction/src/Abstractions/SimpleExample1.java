package Abstractions;

abstract class Animal{
	public abstract void Sound();
}
class Dog extends Animal{
	@Override
	public void Sound() {
		System.out.println("Dog Barks");
	}
}
class Cat extends Animal{
	@Override
	public void Sound() {
		System.out.println("Cat Mowes");
	}
}
public class SimpleExample1 {

	public static void main(String[] args) {
		Animal obj=new Cat();
		obj.Sound();
		Animal onj1=new Dog();
		onj1.Sound();
	}
}
