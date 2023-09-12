package basic;

public class palindorme {
	public static void main(String[] args) {
       int num=12321;
       int orgnum=num;
       int rev=0;
       while(num>0) {
    	   rev=rev*10+num%10;
    	   num=num/10;
       }
       if(orgnum==rev) {
    	   System.out.println("palindrome"+rev);
       }
		
	}

}
