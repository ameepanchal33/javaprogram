package basic;
import java.util.Scanner;

public class fectorial {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number:");
		int no = sc.nextInt();
		
		int fect=1;
		for(int i=1;i<=no;i++) {
			
			 fect=fect*i;
		
		}
		System.out.println("fectorial number is::"+fect);
		
		
		
				
	}

}
