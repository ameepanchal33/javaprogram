package basic;
import java.util.Scanner;
public class Assign34 {
	

	 public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the First Number");
	        int i=sc.nextInt();
	        System.out.println("Enter the Second Number");
	        int j=sc.nextInt();
	        try {
	        	 System.out.println(i/j);
	        }catch(Exception e) {
	        	System.out.println(e);
	        }
	        sc.close();
		}
	}
}
