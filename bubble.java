package basic;

import java.util.Arrays;

public class bubble {
	
	public static void main(String[] args) {
		
		int a[]= {4,5,3,1,2};
//		int n=a.length;
		System.out.println("arrys before swapping:"+Arrays.toString(a));
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++){
				if(a[j]>a[j+1]) {
				int temp=a[j];
					a[j]=a[j+1];
				    a[j+1]=temp;
				}   
				
			}
		}
		System.out.println("after swapping"+Arrays.toString(a));

	}
	
	
}
