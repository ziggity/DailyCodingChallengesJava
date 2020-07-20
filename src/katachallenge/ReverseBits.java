package katachallenge;

public class ReverseBits {
	public static void main(String[] args) {
		System.out.println(mirrorBits(97));
	}
	public static int mirrorBits(int a) {
	    String binaryDigits = Integer.toBinaryString(a);
	   String result =  new StringBuilder(binaryDigits).reverse().toString();
	   return Integer.parseInt(result, 2);
	}
}


/*Reverse the order of the bits in a given integer.
Example
For a = 97, the output should be
mirrorBits(a) = 67.
97 equals to 1100001 in binary, which is 1000011 after mirroring, and that is 67 in base 10.
For a = 8, the output should be
mirrorBits(a) = 1.
Input/Output
[execution time limit] 3 seconds (java)
[input] integer a
Guaranteed constraints:
5 ≤ a ≤ 105.
[output] integer
*/

