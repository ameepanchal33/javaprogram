package basic;

public class ArraysMatchornot {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5,6};
		boolean status=false;
		if(a.length==b.length) {
		   for(int i=0;i<=a.length-1;i++)  	{
			   if(a[i]!=b[i]) {
				   status=false;
			   }
		   }
		}
		else {
			System.out.println("not equals");
		}
		if(status=true) {
			System.out.println("element are not matched");
		}
	}
	

}
