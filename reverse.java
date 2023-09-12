package basic;

public class reverse {
    public static void main(String[] args) {
	  String str=" hello ";
	  String rev=" ";
	  char[] c=str.toCharArray();
	  for(int i=str.length()-1;i>=0;i--) {
		  rev=rev+c[i];
		 
	  }
	  System.out.println(rev);
   }
} 



