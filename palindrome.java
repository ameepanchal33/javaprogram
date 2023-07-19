package basic;

public class palindrome {
	public static void main(String[] args) {
		int n=454;
		int r,sum=0,temp = 0;
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("is palindrome");
		}
		else
		{
			System.out.println("not palindrome:");
		}
	}
}
