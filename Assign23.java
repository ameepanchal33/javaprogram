package basic;
class FindArea{
	public void area(int side) {
		System.out.println("area of Square:"+side*4);
	}
	public void area(float length,float breadth) {
		System.out.println("area of Regtangle:"+length*breadth);
	}
}

public class Assign23 {
  public static void main(String[] args) {
	  FindArea F=new FindArea();
	  F.area(4);
	  F.area(10.2f,50.2f);
}
}
