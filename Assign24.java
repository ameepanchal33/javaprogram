package basic;
class parent{
	public void parentM() {
		System.out.println("arent class method");
	}
}
class child extends parent{
	public void childM() {
		System.out.println("child class methods");
	}
}
class child2 extends child{
	public void child2M() {
		System.out.println("child 2 methods");
	}
}
public class Assign24 {
	public static void main(String[] args) {
		child c=new child();
		child2 ch=new child2();
		c.parentM();
		c.childM();
		ch.child2M();
		ch.childM();
	}

}
