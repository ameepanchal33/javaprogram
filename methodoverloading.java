package basic;
import java.util.Scanner;
class overload{
	public void area(int l,int b) {
		System.out.println("square::"+(l*b));
	}
	public void area(int r) {
		System.out.println("circlr::"+(Math.PI*r*r));
	}
}

public class methodoverloading {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.int);
		//float r =sc.nextInt();
		overload o=new overload();
		o.area(3);
		o.area(45,20);
	}

}
