package basic;

public class StringEndswith_Se {
	public static void main(String[] args) {
		String s="Java Exercises";
		String e="se";
		boolean res=s.endsWith(e);
		System.out.println(s+"ends with"+e+" : "+res);
		
		String s1="Java Exercise";
		String e1="se";
		boolean ress=s1.endsWith(e1);
		System.out.println(s1+"ends with"+e1+":"+ress);
		
		
	}

}
