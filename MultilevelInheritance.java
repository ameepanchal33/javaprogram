package basic;
class cat{
	void meao() {
		System.out.println("meowing....");
	}
}
class mouse extends cat {
	void bark() {
		System.out.println("chuchu...");
	}
}
class goat extends mouse{
	void eat() {
		System.out.println("eating....");
	}
	
}


public class MultilevelInheritance {
	public static void main(String[] args) {
		goat g=new goat();
		g.meao();
		g.bark();
		g.eat();
		
	}
	

}
