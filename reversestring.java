package basic;

import java.util.Scanner;

public class reversestring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
//		int rev=0;
     	int num=sc.nextInt();
//		
//		while(num!=0) {
//		   rev=rev*10+num%10;  //0*10+1234%10=4  rev=4
//			num/=10;           //1234/10=123 4 eleminate//rev=4*10=40+123%10=3=43
//		}
//		System.out.println(rev);
//		
//		StringBuffer sb=new StringBuffer(String.valueOf(num));
//		StringBuffer rev= sb.reverse();
//		System.out.println(rev);
//	
     	StringBuffer str=new StringBuffer(String.valueOf(num));
     	StringBuffer rev=str.reverse();
     	System.out.println(rev);
	}

}
