package basic;

public class ArrayReverseString {
	public static void main(String[] args) {
	 
			int arr[]=new int[] {1,2,3,4,5};
		
		for(int i=0;i<arr.length;i++) {
			//System.out.println("print arry:");
			System.out.print(arr[i]+"");
		}
		for(int i=arr.length-1;i>=0;i--) {
			//System.out.println("reverse:");
			System.out.print(arr[i]+"");
		}
	 
	
		
	}
}

