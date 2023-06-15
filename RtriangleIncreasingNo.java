package basic;
import java.util.Scanner;

public class RtriangleIncreasingNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no:");
		int no=sc.nextInt();
		for(int i=1;i<no;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(no+" ");
				no++;
			}
			System.out.println(" ");
		}
	}

}
