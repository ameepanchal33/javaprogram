package basic;

public class missingno {
	public static void main(String[] args) {
		int a[]= {1,2,4,5};
		int sum1=0;
	    
		for(int i=0;i<a.length;i++) {
		      sum1+=a[i];
		}
		System.out.println("arrays sum"+sum1);
		
		int sum2=0;
		for(int i=1;i<=5;i++) {
			sum2+=i;
		}
		System.out.println("arrys sum1"+sum2);
		System.out.println("missing no::"+(sum2-sum1));
	}
	

}
