
public class BinarySearch {

	public static void main(String[] args) {

		int elem[] = { 2, 5, 7, 9, 11, 13, 19, 24 };

		int target = 5;

		int result = binarySearch(elem, target);

		System.out.println("Result :" + result);

	}

	static int binarySearch(int[] elem, int target) {

		int start = 0;
		int end = elem.length - 1;

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

		return -1;

	}

}
