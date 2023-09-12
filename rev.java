package basic;

public class rev {
  public static void main(String[] args) {
//	String str="  Hello  World ";
//	char a[]=str.toCharArray();
//	String rev=" ";
//	  int len=str.length();
//	for(int i=len-1;i>=0;i--) {
//		rev=rev+a[i];
//	}
//	System.out.println(rev);
//	
	  
	  String str="Hello";
	  int len=str.length();
	  char a[]=str.toCharArray();
	  String rev=" ";
	  for(int i=len-1;i>=0;i--) {
		 rev=rev+a[i];
	  }
	  System.out.println(rev);
  }

}
