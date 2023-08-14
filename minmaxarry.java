package basic;

public class minmaxarry {
	public static int findminandmaxi(int[] arr) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			
		}
		return min;
	}
	public static int findmaxelement(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] arr= {2,1,13,5,1};
		int min= findminandmaxi(arr);
		int max=findmaxelement(arr);
		System.out.println(min);
		System.out.println(max);
		
	}
 
	
	
}
