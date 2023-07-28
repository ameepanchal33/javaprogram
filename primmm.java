package basic;

import java.util.Scanner;

public class primmm {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		int flag=0;

		int n=sc.nextInt();
		
		int m=n/2;
		
		for(int i=2;i<m;i++) {
			if(n%3==0) {
				System.out.println("not prime");
				flag=1;
                break;
				
			}
		}
		if(flag==0) {
			System.out.println("prime");
		}
	}

}
