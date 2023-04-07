
public class InfiniteArray {

	// Provided an infinite array of ordered element find the target number index..
	
	
	public static void main(String[] args) {

		int elem[] = { 2, 5, 7, 9, 11, 13, 19, 24 };

		int target = 5;

		int result = range(elem, target);

		System.out.println("Result :" + result);

	}
	
	// get the target element subset array by searching in chunk
	//we will start with 2 element array chunk and double the size
	
	static int range(int[] elem,int target) {
		
		int start = 0;
		int end = 1;
		
		while(target > elem[end]) {
			
			int temp = end + 1;
			end =  end + (2 * (end - start + 1));
			start = temp;
			
		}
		
		return binarySearch(elem, target,start,end);
	}

	static int binarySearch(int[] elem, int target, int start, int end) {

		
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
