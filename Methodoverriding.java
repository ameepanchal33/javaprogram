package basic;
class a{
	public void methhods() {
		System.out.println("void maethoda a");
	}
}
class b extends a{
	public void methhods() {
		super.methhods();
		System.out.println("void b");
	}
}
public class Methodoverriding {
public static void main(String[] args) {
	b be=new b();
	be.methhods();
	
}
}
