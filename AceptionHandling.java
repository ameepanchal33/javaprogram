package basic;
import java.util.InputMismatchException;
import java.util.Scanner;
public class AceptionHandling {
public static void main(String[] args) {
	try {
		int q=10;
		int h=0;
	  int r=q/h;
		System.out.println("division"+r);
		
	}catch(ArithmeticException e) {
		System.out.println("denomineter cannot be zero");
	}catch(InputMismatchException e) {
		System.out.println("mismatch input");
	}catch(Exception e) {
		System.out.println("errer");
	}
	finally {
		System.out.println("this will execute every time:");
	}
	 
 }
}

