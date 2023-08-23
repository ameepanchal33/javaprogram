package basic;

import java.util.Arrays;

public class Selectionsort {
	public static void main(String[] args) {
		int a[]= {1,5,6,4,3,2,0};
		System.out.println("Befor sorted arrys"+Arrays.toString(a));
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			int m=i;
		    for(int j=i+1;j<n-1;j++) {
		    	if(a[m]>a[j]) {
		    		m=j;
		    	}
		    	int temp=a[m];
		    	a[m]=a[i];
		    	a[i]=temp;
		    }
		   System.out.println("After sorted elemnt:"+Arrays.toString(a));
		}
	}
 
 
}
