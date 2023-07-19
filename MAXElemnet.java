package basic;
import java.util.Scanner;

public class MAXElemnet {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int [] arr=new int[] {1,2,3,4,5};
	int mx=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>mx)
			mx=arr[i];
	}
	System.out.println(mx);
		
	}

}
