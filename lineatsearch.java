package basic;

public class lineatsearch {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,3,3};
		int key=3;
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			if(key==a[i]) {
				System.out.println("element is:"+key);
				flag=true;
				break;
			}
			
		}
		if(flag==false) {
			System.out.println("not found");
		}
	}

}
