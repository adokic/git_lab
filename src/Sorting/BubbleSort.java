package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
	//null check
		if (array == null){
			return null;
		}
		
		int tmp;
		
		for (int i = 0; i < array.length -1; i++){
			for (int j = 1; j < array.length - i; j++){
				if(array[j-1] > array[j]){
					tmp = array[j-1];
					array[j-1] = array[j];
					array[j] = tmp;
				}
			}
		}
		
	    return array;
	}
}
