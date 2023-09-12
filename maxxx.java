package basic;

public class maxxx {
	public static void main(String[] args) {
		char[] a= {5,9,8,7,9,5};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			
		}
		System.out.println(max);
	}

}
