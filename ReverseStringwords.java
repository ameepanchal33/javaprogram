package basic;

public class ReverseStringwords {
	public static void main(String[] args) {
		String Str="Welcome to DDU";
		String[] words=Str.split(" ");
		String reversString=" ";
		for(String w:words) {
			String reverseWords=" ";
			
			for(int i=w.length()-1;i>=0;i--) {
				 reverseWords= reverseWords+ w.charAt(i);
				
			}
			reversString =reversString+reverseWords+" ";
		}
          System.out.println("ReverseString:"+reversString);
	}
	
}
