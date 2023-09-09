package basic;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		String str=" Amee HYY        PAnchal    Whatsup  UP";
				str=str.replaceAll("\s","");
				System.out.println(str);
	}

}
