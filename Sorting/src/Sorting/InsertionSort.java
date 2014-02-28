package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] unsortedArray) {
		//TODO: S2 implements insertion sort
		if ((unsortedArray==null)||(unsortedArray.length==0))
				return unsortedArray;
		int length = unsortedArray.length;
		int[] result = new int[length];
		result[0] = unsortedArray[0];

		for (int i = 1; i < length; i++) {
			int target = unsortedArray[i];
			for (int j = 0; j < i-1; j++) if (result[j] > target) {
				int temp = target;
				target = result[j];
				result[j] = temp;
			}
			result[i] = target;
		}
		return result;
	}
}
