package basic;
import java.util.Scanner;

public class vovelcosonunt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int i= 0;
	    int n=1;
	    System.out.println("enter the charecter");
	    char c =  sc.next( ).charAt(0);
	   
	    
	    if(c =='a' || c== 'e' || c== 'i' || c== 'o' || c== 'u' || c== 'A'  || c=='O' || c=='U' || c=='E' ||  c=='I') {
	    	System.out.println("vowela:"+c);
	    	
	    }
	    else if((c>='a'&& c<='z') || (c>='A'&& c<='Z')){
	    	System.out.println("constant"+c);
	    	
	    	
	    }
	    else {
	    	System.out.println("alphabet");
	    }
	    
	    }
		
	
	
	
}