package basic;

public class duplicateelemntinArray {
    public static void main(String[] args) {
        int [] arr =new int [] {1,2,2,3,4,55,5,5};
        for(int i=0;i<arr.length;i++) {
        	for(int j=i+1;j<arr.length;j++) {
        		if(arr[i]==arr[j]) {
        			System.out.println(arr[j]);
        		}
        	}
        }
        
    }

}
