package basic;
class Rectangle{
	private float length;
	private float breadth;
	public Rectangle(float length,float breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public void area() {
		System.out.println("area of rectangle:"+length*breadth);
	}
	public void perimeter() {
		System.out.println("perimeter of reactangle:"+(length+breadth)*2);
		
	}
	
}
class Square extends Rectangle{
	public Square(float side) {
		super(side,side);
	}
}
public class Assign26 {
	public static void main(String[] args) {
		
		Rectangle re=new Rectangle(5,10);
		re.area();
		re.perimeter();
		
		Square s= new Square(7);
		s.area();
		s.perimeter();
		
	}

}
