package basic;

public class ArrymaxRecursion {
	static int arr []=new int[] {1,2,3,4,5};
	static int larg() {
		int i;
		int max=arr[0];
		for(i=1;i<arr.length;i++)
			if(arr[i]>max) max=arr[i];
				return max;
		
		
	}
	public static void main(String[] args) {
		System.out.println("largest:"+larg());
		
	}

}
