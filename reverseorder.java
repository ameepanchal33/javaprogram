package basic;

import java.util.Arrays;
import java.util.Collections;



public class reverseorder {
	public static void main(String[] args) {
//		int a[]= {0,5,8,7,9,0,1};
//		System.out.println("before sorting:"+Arrays.toString(a));
//		Arrays.parallelSort(a);
//		System.out.println("after sorting:"+Arrays.toString(a));
		
//		Arrays.sort(a);
//		System.out.println("after sorting:"+Arrays.toString(a));
		Integer  a[]= {0,5,8,7,9,0,1};	
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("after sorting:"+Arrays.toString(a));
		
		
	}

}
