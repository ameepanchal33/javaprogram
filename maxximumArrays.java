package basic;

public class maxximumArrays {
	public static void main(String[] args) {
		int a[]= {1,12,3,4,5,0};
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("maximum element"+max);
		
	}
	
	

}
