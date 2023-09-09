package basic;

public class OcuurensesofChar {
	public static void main(String[] args) {
		String str=" Hyy Amee Panchal Whatsup ";
	    int	total=str.length();
		int totalcount=str.replace("a", "").length();
		int remove=total-totalcount;
		System.out.println(remove);
				
	}

}
