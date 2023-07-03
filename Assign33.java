package basic;
abstract class Shapp{ 
	abstract void squareArea(int l);
	abstract void RectangleArea(int l,int b);
	abstract void CircleArea(int r);
}
class Area extends Shapp{

	@Override
	void squareArea(int l) {
		System.out.println("square area:"+l*l);
		
	}

	@Override
	void RectangleArea(int l, int b) {
		System.out.println("Rectanglearea:"+l*b);
		
	}

	@Override
	void CircleArea(int r) {
		System.out.println("circle area:"+3.14*r*r);
		
	}
	
}
public class Assign33 {
public static void main(String[] args) {
	Area a=new Area();
	a.squareArea(5);
	a.RectangleArea(4,5);
	a.CircleArea(6);
}
}
