package basic;

public class reversee {
	public static void main(String[] args) {
		String str="hello";
		String rev=" ";
		char[] a=str.toCharArray();
		for(int i=a.length-1;i>=0;i--) {
			rev=rev+a[i];
		}
		System.out.println(rev);
		
	}

}
