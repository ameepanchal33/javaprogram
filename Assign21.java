package basic;
class printt{
	public void print(int number) {
		System.out.println("print Integer:"+number);
	}
	public void print(byte number) {
		System.out.println("print Byte:"+number);
	}
	public void print(short number) {
		System.out.println("print short:"+number);
	}
	public void print(long number) {
		System.out.println("print long:"+number);
	}
	public void print(double number) {
		System.out.println("print Double:"+number);
	}
	public void print(char number) {
		System.out.println("print char:"+number);
	}
	public void print(String text) {
		System.out.println("print String:"+text);
	}
	
}
public class Assign21{
public static void main(String[] args) {
	printt p=new printt();
	p.print(10);
	p.print(40000);
	p.print(1000.3);
	p.print('A');
	p.print("Amee");
	
	
} 
	
}
