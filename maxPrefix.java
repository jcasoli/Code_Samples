
public class maxPrefix {

	public int getMaxPrefix(int[] arr) {
		/*
		 * This function finds the maximum 
		 */
		
		//Check for valid input
		if (arr==null || arr.length == 0){
			return -1;
		}
		
		//maxprefix is 0 in this case
		if (arr.length == 1){
			return 0;
		}
		
		//floor_index keeps track of where the last minimum occured. As we move to the right
		//	if we see a number smaller than our current floor_num, then we can no longer use the current floor_num
		// 	as our as our element that will determine maxprefix
		int floor_index = 0;
		
		//The index of floor_num in arr
		int floor_num = Integer.MAX_VALUE;
		int i = 0;
		
		while (i < arr.length){
			
			//We must adjust floor_num and floor_index if we encounter a smaller element than our
			// Current floor_num
			if (arr[i] <= floor_num){
				floor_num = arr[i];
				floor_index = i;
			}
			i++;
		}
		
		//This is the maximum strictly non-decreasing sequence that includes the last element in arr, or maxprefix
		return arr.length - floor_index - 1;
	}
	
	public static void main(String[] args){
		int[] test1 = {10, -4, 6, 2, 8, 9, 4};
		int[] test2 = {1, 2, 2, 2, 3, 3, 4};
		int[] test3 = {4, 3, 2, 1, 0};
		int[] test4 = {0, 0};
		maxPrefix m = new maxPrefix();
		System.out.println(m.getMaxPrefix(test1));
		System.out.println(m.getMaxPrefix(test2));
		System.out.println(m.getMaxPrefix(test3));
		System.out.println(m.getMaxPrefix(test4));
	}

}
