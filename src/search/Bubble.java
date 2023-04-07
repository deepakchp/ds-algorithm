package search;

import java.util.Arrays;

public class Bubble {
	
	public static void main(String args[]) {
		
		int elem[] = {8,1,4,2,10,34,1,56,2,2,34};
		
		int[] arr = bubble(elem);
		
		System.out.println(Arrays.toString(arr));
	}
	
	static int[] bubble(int[] elem) {
		
		boolean swapped = false;
		
		for(int i=0; i< elem.length; i++) {
			
			for(int j=0; j < (elem.length-1)-i;j++) {
				
				if(elem[j] > elem[j+1]) {
					int temp = elem[j+1];
					elem[j+1] = elem[j];
					elem[j] = temp;
					swapped = true;
				}
			}
			
			if(!swapped)
				break;
		}
		
		return elem;
		
	}
}
