package basic;

abstract class parentt{
	abstract void  message();
		
	
}
class subclass1 extends parentt{

	@Override
	void message() {
		
		System.out.println("this first  is subclass");
	}
	
	
	
}
 class subclass2 extends parentt{

	@Override
	void message() {
	  System.out.println("this is second subclass");
		
	}
	
}
public class Assign29 {
	public static void main(String[] args) { 
		subclass1 s1=new subclass1();
		s1.message();
		subclass2 s2 =new subclass2();
		s2.message();
	}

}

