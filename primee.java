package basic;

import java.util.Scanner;

public class primee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("emter the no:");
		int n=sc.nextInt();
		int flag=0;
		int m=n/2;
		if(n==1 || n==2) {
			System.out.println("not prime no:");
		}
	    for(int i=2;i<m;i++) {
				if(i%3==0) {
					System.out.println("not prime:");
					flag=1;
				}
			
		}
	    if(flag==0) {
	    	System.out.println("prime");
	    }
	}
	

}
