package basic;

public class maxelimentArry {
	public static void main(String[] args) {
		int arr[]=new int[] {45,56,47,85,96};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max)
				max=arr[i];
			
		}
		
		System.out.println("max:"+max);
	}
		
}
