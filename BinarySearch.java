package basic;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
	 int a[]= {10,20,35,50,60,70,90,100};
//	 int l=0;
//	 int h=a.length-1;
//	 int key=50;
//	 boolean flag=false;
//	 
//	 while(l<=h) {
//		 int m=(l+h)/2;
//		 if(a[m] ==key) {
//			 System.out.println("elementis found");
//			 flag=true;
//			 break;
//		 }
//		 if(a[m]<key) {
//			 l=m+1;
//			
//			 
//		 }
//		 if(a[m]>key) {
//			 h=m-1;
//			 
//		 }
//	 }
//	 if(flag==false) {
//		 System.out.println("element is not found");
//	 }
//	
    	
    	System.out.println(Arrays.binarySearch(a, 50));
    	System.out.println(a[3]);
  }

}
