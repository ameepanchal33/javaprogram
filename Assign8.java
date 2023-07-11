package basic;
import java.util.Scanner;

public class Assign8 {
	public static void main(String[] args) {
		int counter=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no::");
		int no=sc.nextInt();
		while(no!=0) {
			no=no/10;
			++counter;
		}
		
		System.out.println("digi"+counter);
	}
	
}
