package basic;

public class Secondheighestelement {
	public static int secondheightelement(int[] arr) {
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				smax=max;
				max=arr[i];
				
			}
			else if(arr[i]>smax && arr[i]<max)
		        smax=arr[i];
		}
		return smax;
		
	}
	public static void main(String[] args) {
		int arr[]= {1,2,34,5,4,6};
		int input=secondheightelement(arr) ;
		System.out.println(input);
	}
	

}
