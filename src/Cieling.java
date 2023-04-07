
public class Cieling {

	
	// Cieling means - Find the  smallest number in the array which is equal to or greater than target.
	
	public static void main(String[] args) {

		int elem[] = { 2, 5, 7, 9, 11, 13, 19, 24 };

		int target = 25;

		int result = cieling(elem, target);

		System.out.println("Result :" + result);

	}

	static int cieling(int[] elem, int target) {

		
		int start = 0;
		int end = elem.length - 1;

		if(target > elem[end]) {
			return -1;
		}
		while (start <= end) {
			int mid = (start + end) / 2;

			if (elem[mid] == target) {
				return mid;
			}

			if (target > elem[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return start;

	}

}
