
public class Multiply {

	public static int[] weirdMultiply(int[] numbers){
		if (numbers.length==0 || numbers == null){
			return null;
		}
		
		if (numbers.length == 1){
			numbers[0] = 1;
			return numbers;
		}
		
		int[] products_so_far = new int[numbers.length];
		int product_so_far = 1;
		
		for (int i=0;i<numbers.length-1;i++){
			product_so_far *= numbers[i];
			products_so_far[i] = product_so_far;
		}
		
		product_so_far = 1;
		for (int i=numbers.length-1;i>=0;i--){
			if (i>=1){
				products_so_far[i] = products_so_far[i-1] * product_so_far;
			}else{
				products_so_far[i] = product_so_far;
			}
			product_so_far*=numbers[i];
		}
		return products_so_far;
	}
	
	public static void main(String[] args){
		int[] test1 = {1, 4, -2, 1};
		int[] test2 = {2, 4, 5};
		int[] test3 = {1};
		
		for (int elem : weirdMultiply(test1)){
			System.out.println(elem);
		}
		for (int elem : weirdMultiply(test2)){
			System.out.println(elem);
		}
		for (int elem : weirdMultiply(test3)){
			System.out.println(elem);
		}
		
		
	}
	
}
