package basic;
import java.util.Scanner;

public class array1 {
 public static void main(String[] args) {
	 
	 Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	int size=sc.nextInt();
	int arr[]=new int[size];
	int sum=0;
	for(int i=0; i<arr.length;i++) {
		System.out.println("enter the numbers:");
		
		arr[i]=sc.nextInt();
		sum+=arr[i];
	}
	System.out.println("sum of"+sum);
	
			
 }
}
