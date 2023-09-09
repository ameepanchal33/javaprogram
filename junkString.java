package basic;

public class junkString {

	public static void main(String[] args) {
		String s="hyy #%$^%^@%#^ Amee Panchal";
		s=s.replaceAll("[^A-Za-z0-9]","");
		System.out.println(s);
	}
}
