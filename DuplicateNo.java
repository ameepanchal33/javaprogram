package basic;

public class DuplicateNo {
	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 6 };
		System.out.println("Duplicate Element:");
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println("Element " + arr[i] + " is duplicate");
			}
	
		}

	//	printDuplicateElements(new int[] { 1, 2, 3, 4, 5, 5, 6, 6 });
	}

	private static void printDuplicateElements(int[] elements) {

		for (int i : elements) {
			int count = 0;
			int currentElement = i;
			for (int j : elements) {
				if (currentElement == j) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println("Element " + i + " is duplicate");
			}
		}
	}

}
