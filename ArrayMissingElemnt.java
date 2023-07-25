package basic;
import java.util.Scanner;

public class ArrayMissingElemnt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the total no elemnt:");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=(n+1)*(n+2)/2;
		for(int i=0;i<n;i++) {
			sum=sum-arr[i];
		}
		System.out.println("missing elemnt is:"+sum);
	}

}
