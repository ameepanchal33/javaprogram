package basic;
import java.util.Scanner;

public class Fibonaci {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Eneter the no");
	int count=sc.nextInt();
	int n1=0,n2=1,n3;
	System.out.println(n1);
	System.out.println(n2);
	
	for(int i=2;i<count;++i) {
		n3=n1+n2;
		System.out.println(n3);
		n1=n2;
		n2=n3;
	}
}
}
