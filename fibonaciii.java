package basic;

public class fibonaciii {
	public static void main(String[] args) {
		int num=7;
		int n1=0,n2=1,n3;
		System.out.println(n1+"\n" +n2);
		for(int i=0;i<num;i++) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
		
	}
	
	

}
