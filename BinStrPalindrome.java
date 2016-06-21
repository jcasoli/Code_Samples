public class BinStrPalindrome {

	public static void generateBinStrings(int n){
		/*
		 * Helper function to set up the recursive call to generateBinStrings
		 */
		
		//Check for valid input
		if (n<1){
			return;
		}
		
		// These 3 cases can produce all binary string palindromes. It is easy to see that they will not
		// 		produce any overlapping solutions. 
		generateBinStrings("", n);	// This will generate all even length palindromes
		generateBinStrings("1", n);		//This will generate all odd length palindromes where '1' is middle bit
		generateBinStrings("0", n);		//This will gererate all odd length palindromes where '0' is middle bit
	}
	
	private static void generateBinStrings(String bin_string, int n){
		/*
		 * prints all binary string palindromes up to length n 
		 */
		
		//We don't want to print any palindromes that start (and end) in '0' also don't print the empty string
		if (bin_string.length() > 0 && bin_string.charAt(0) != '0'){
			System.out.println(bin_string);
		}
		
		// Make sure we stop at n
		if (bin_string.length() + 2 <= n){
			
			//Recursively generate the next palindrome by either appending '1' to both sides or '0'
			generateBinStrings("1" + bin_string + "1", n);
			generateBinStrings("0" + bin_string + "0", n);
		}
	}
	
	public static void main(String[] args){
		generateBinStrings(12);
		generateBinStrings(3);
		generateBinStrings(0);
	}
	
}
