package basic;

public class RevStr {
	public static void main(String[] args) {
	    String Str="ABCD hio";
	    String rev="";
	    int len=Str.length();
	    for(int i=len-1;i>=0;i--) {
	    	rev=rev+Str.charAt(i);
	    	
	    }
	    System.out.println(rev);
	    
	    		
	}
 
}
