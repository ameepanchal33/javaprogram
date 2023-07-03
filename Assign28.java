package basic;
import java.util.Scanner;
class complex{
	 public void add(int a,int b) {
	    	System.out.println(a+b);
	   }
	 public void sub(int a,int b) {
		 System.out.println(a-b);
	 }
	 public void product(int a,int b) {
		 System.out.println(a*b);
	 }
}
public class Assign28 {
public static void main(String[] args) {
   complex c=new complex();
   c.add(12, 12);
   c.sub(45, 40);
   c.product(4,4);
   
 }
}
