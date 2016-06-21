
public class Sort {
	
	public static void quickSort(int[] numbs){
	/*
	 * An implementation of quickSort using the rightmost element as pivot. This function just
	 * 	sets up the recurive function call. 
	 */
		Sort.quickSortRecursive(numbs, 0, numbs.length-1);
		return;
	}

	private static void quickSortRecursive(int[] numbs, int low, int high){
		/*
		 * Quicksort using rightmost element as function call. 
		 */
		int pivot;
		
		if (low < high){
			
			//pivot around element in rightmost position
			pivot = Sort.partition(numbs, low, high);
			
			//
			Sort.quickSortRecursive(numbs, low, pivot-1);
			Sort.quickSortRecursive(numbs, pivot +1, high);
		}
		return;
	}
	
	private static int partition(int[] a, int low, int high){
		int pivot = a[high];
		int i = low;
		int temp;
		for (int j=low; j<high;j++){
			if (a[j] <= pivot){
				temp = a[j];
				a[j] = a[i];
				a[i] = temp;
				i++;
			}
		}
		temp = a[i];
		a[i] = a[high];
		a[high] = temp;
		return i;
	}
	
	public static void mergeSort(int[] numbs){
		int[] temp = new int[numbs.length];
		mergeSort(numbs, temp, 0, numbs.length-1);
	}
	
	private static void mergeSort(int[] numbs, int[] temp, int low, int high){
		if (low < high){
			int center = ((low+high)/2);
			mergeSort(numbs, temp, low, center);
			mergeSort(numbs, temp, center + 1, high);
			merge(numbs, temp, low, center +1, high);
		}
		return;
	}
	
	private static void merge(int[] numbs, int[] temp, int left, int right, int rightend){
		int leftend = right -1;
		int k = left;
		int num = rightend - left + 1;
		while (left <= leftend && right <= rightend){
			if (numbs[left] < numbs[right]){
				temp[k++] = numbs[left++];
			}else{
				temp[k++] = numbs[right++];
			}
		}
		while (left<=leftend)
			temp[k++] = numbs[left++];
		while (right<=rightend)
			temp[k++] = numbs[right++];
		
		for (int i=0; i < num; i++, rightend--)
			numbs[rightend] = temp[rightend];
		
		
	}
	
	public static void main(String[] args) {
		int[] numbs = {4, 7, 1, 9, 3, 3};
		int[] numbs2 = {1, 1, 2, 1, 1, 3, 4, 2};
		int[] numbs3 = {1};
		int[] numbs4 = {1, -3, -4, 5, -1, 10};
		mergeSort(numbs);
		mergeSort(numbs2);
		mergeSort(numbs3);
		mergeSort(numbs4);
		for (int i=0;i<numbs.length; i++){
			System.out.print(numbs[i]);    
		}
		System.out.println("");
		for (int i=0;i<numbs2.length; i++){
			System.out.print(numbs2[i]);    
		}
		System.out.println("");
		for (int i=0;i<numbs3.length; i++){
			System.out.print(numbs3[i]);    
		}
		System.out.println("");
		for (int i=0;i<numbs4.length; i++){
			System.out.print(numbs4[i]);    
		}
		System.out.println("");
		
		
		

	}

}
