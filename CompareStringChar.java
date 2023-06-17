package basic;
import java.util.Scanner;

public class CompareStringChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string::");
		System.out.println();
		String s1=sc.next();
		String s2=sc.next();
		
		System.out.println(s1.compareTo(s2)+"true");
		
		
	}

}
