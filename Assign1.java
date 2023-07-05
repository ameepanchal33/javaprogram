package basic;
import java.util.Scanner;

public class Assign1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number::");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b) {
			if(a>c) {
			System.out.println("a is big"+a);
			}
			else {
				System.out.println("c is big"+c);
			}
		}
		else {
			if(b>c) {
				System.out.println("b is big"+b);
			}
			else {
				System.out.println("c us big"+c);
			}
		}
		
		
		
	}

}
