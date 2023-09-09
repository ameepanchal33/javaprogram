package basic;

import java.util.Arrays;

public class Bubblesort {
	public static void main(String[] args) {
		int a[]= {12,2,4,8,9,10};
		System.out.println("before sorting:"+Arrays.toString(a));
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
				        a[j]=a[j+1];
				        a[j+1]=temp;
				}
				
			}
			
		}
	System.out.println("sorted:"+Arrays.toString(a));
	}

}
