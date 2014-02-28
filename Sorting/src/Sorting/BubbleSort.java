package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		//TODO: S1 implements bubble sort
		if(unsortedArray == null){
			return null;
		}
		int length = unsortedArray.length();
		if(length ==1)
			return unsortedArray;
		for(int i=1;i<length;i++){
			boolean swapped = false;
			if(unsortedArray[i-1]>unsortedArray[i]){
				int tmp = unsortedArray[i-1];
				unsortedArray[i-1] = unsortedArray[i];
				unsortedArray[i] = tmp;
				swapped = true;
			}
			if(!swapped){
				break;
			}
		}

		return unsortedArray;
	}
}
