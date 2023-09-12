package basic;

public class minnn {
	public static void main(String[] args) {
		char[] c= {4,9,7,8,6,5,2};
		int min=c[0];
		for(int i=0;i<c.length;i++) {
			if(c[i]<min) {
				min=c[i];
			}
			
		}
		System.out.println(min);
	}

}
