package basic;
import java.util.Scanner;

public class leap {
	public static void main(String[] args) {
	  
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the year:");
		int year=sc.nextInt();
		
		  if(year%4==0) {
			  System.out.println("leap year:"+year);
		  }
		  else if(year/100==0) {
			  System.out.println("leap year"+year);
		  }
		  else {
			  System.out.println("not a leap+year" +year);
		  }
		
		
		
		
		
	}

}
