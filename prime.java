package basic;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no:");
		int n=sc.nextInt();
		int m=n/2;
		int flag = 0;
		
		if(n==0||n==1) {
			System.out.println("not prime nu");
		}	
		for(int i=2;i<m;i++) {
			if(i%3==0) {
				System.out.println("not prime");
				flag=1;
				break;
			}
		
		}
		if(flag==0) {
			System.out.println("is prime");
		}
	}

}
