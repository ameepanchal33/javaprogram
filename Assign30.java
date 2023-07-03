package basic;
 abstract class Bank{
	abstract void getBalance(); 
}
 class A extends Bank{

	@Override
	void getBalance() {
		System.out.println("get deposite 100$");
		
	}
	 
 }
 class B extends Bank{

	@Override
	void getBalance() {
		System.out.println("get deposite 200$");
	}
	 
 }
 class C extends Bank{

	@Override
	void getBalance() {
		System.out.println("get deposite 300$");
		
	}
	 
 }
public class Assign30 {
	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		C c=new C();
		a.getBalance();
		b.getBalance();
		c.getBalance();
		
	}
}
