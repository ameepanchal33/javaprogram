package basic;

import java.util.Arrays;

public class bubblesortt {
	public static void main(String[] args) {
		int[] a= {1,2,3,8,5,4,6};
		
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
			   if(a[j]>a[j+1]) {
				int temp=a[j];
				   a[j]=a[j+1];
				   a[j+1]=temp;
			   }
			}
		}
		System.out.println(" Arrys aftersorting"+Arrays.toString(a));
		System.out.println(a.length-4);
	}

}
