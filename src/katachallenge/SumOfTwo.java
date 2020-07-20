package katachallenge;

import java.util.HashSet;

/*You have two integer arrays, a and b, and an integer target value v. Determine whether there is a pair of numbers, where one number is taken from a and the other from b, that can be added together to get a sum of v. Return true if such a pair exists, otherwise return false.

Example

For a = [1, 2, 3], b = [10, 20, 30, 40], and v = 42, the output should be
sumOfTwo(a, b, v) = true.
*/
// Brute force nested for loops, checking some math as we iterate over the first array, checking values in the 2nd array if they add to V. 
// We can optimize this by using HashTable to make constant time puts and lookups. O(2N) two for loops.
public class SumOfTwo {

	public static void main(String[] args) {
		int[] a = {1, 2, 3}, b = {10, 20, 30, 40};
		int v = 42;
		System.out.println(sumOfTwo(a,b,v));
	}

	private static boolean sumOfTwo(int[] a, int[] b, int v) {
		HashSet<Integer> differences = new HashSet<Integer>();
		for(int i = 0; i< a.length; i++) {
			int difference = v - a[i];
			differences.add(difference);
			System.out.println(differences.toString());
		}
		for(int i = 0; i<b.length; i++) {
			if(differences.contains(b[i])) return true;
		}
		return false;
		
		
	}
	
	
}
