package basic;

public class arrybigelementrightorleft {
	public static int findGreaterlementofnaeighbour(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>arr[i+1]&&arr[i]>arr[i-1]) {
				return arr[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {5,10,20,15};
		int output=findGreaterlementofnaeighbour(arr);
		System.out.println(output);
		
	}

}
