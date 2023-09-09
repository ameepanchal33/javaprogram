package basic;

public class duplicateelement {
	public static void main(String[] args) {
		String a[]= {"java","c++","c","html"};
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
			    if(a[i]==a[j]) {
			      flag=true;
			      System.out.println("duplicate elemant "+a[i]);
			    }
			   
			}
		}
	   if(flag==false) {
		   System.out.println("not found");
	   }
	}

	
}
