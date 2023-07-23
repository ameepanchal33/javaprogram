package basic;

public class palindromeee {
	public static void main(String[] args) {
       int n=454;
       int r,sum=0,temp=0;
       temp=n;
       while(n>0) {
    	   r=n%10;
    	   sum=(sum*10)+r;
    	   n=n/10;
       }
       if(sum==temp) {
    	   System.out.println("is palindormeee");
       }
       else {
    	   System.out.println("not palindrome");
       }
	}
	

}
