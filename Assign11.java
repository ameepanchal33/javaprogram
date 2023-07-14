package basic;
import java.util.Scanner;

public class Assign11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the no:");
		int n=sc.nextInt();
		
		int nn=n*10+n;
		int nnn=nn*10+n;
	
		int result=n+nn+nnn;
		System.out.println(n +"+" +nn+"+"+nnn+"result"+result);
	}
}
