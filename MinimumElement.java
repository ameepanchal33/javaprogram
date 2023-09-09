package basic;

public class MinimumElement {
	public static void main(String[] args) {
		 int a[]= {12,5,4,6,2,0,18};
		 int min=a[0];
		 for(int i=1;i<a.length;i++) {
			 if(a[i]<min) {
				 min=a[i];
			 }
		 }
		 System.out.println("minimum elementin arry:"+min);
		 
	}

}
