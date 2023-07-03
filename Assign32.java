package basic;
import java.util.Scanner;
class Fectoriall{
	int n=2;
	public void fectoril(int n) {
		this.n=n;
		System.out.println("Fectorial:"+n*(n-1));
	}
}
public class Assign32 {
public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	Fectoriall f=new Fectoriall();
	f.fectoril(5);
}
}
