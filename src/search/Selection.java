package search;

import java.util.Arrays;

public class Selection {
	
	public static void main(String args[]) {
		
		int elem[] = {5};
		
		int[] arr = selection(elem);
		
		System.out.println(Arrays.toString(arr));
	}
	
	static int[] selection(int[] elem) {		
		
		
		for(int i=0; i< elem.length; i++) {
			
			int lastIndex = elem.length - i -1;
			int maxIndex = getMaxIndex(elem, lastIndex);
			
			//swap element between last index and maxindex
			
			int temp = elem[lastIndex];
			elem[lastIndex] = elem[maxIndex];
			elem[maxIndex] = temp;
		}	
		
		return elem;
		
	}
	
	static int getMaxIndex(int[] elem,  int end){
		int maxIndex = 0;
		for(int j=0; j < end; j++) {
			if(elem[maxIndex] < elem[j+1]) {
				maxIndex = j+1;
			}
		}
		return maxIndex;
	}
}
