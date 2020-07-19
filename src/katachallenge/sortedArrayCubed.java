package katachallenge;

import java.lang.reflect.Array;

/*Note: Come up with a linear solution, since that is what you would be asked to do in an interview.

# You have a sorted array of integers. Write a function that returns a sorted array containing the squares of those integers.

# Example

# For array = [-6, -4, 1, 2, 3, 5], the output should be
# sortedSquaredArray(array) = [1, 4, 9, 16, 25, 36].

# The array of squared integers from array is: [36, 16, 1, 4, 9, 25]. When sorted, it becomes: [1, 4, 9, 16, 25, 36].

# Input/Output

# [time limit] 4000ms (py)
# [input] array.integer array

# A sorted array of integers.

# Constraints:
# 1 ≤ array.length ≤ 104,
# -104 ≤ array[i] ≤ 104.

# [output] array.integer

# A sorted array of integers composed of the squared integers from the input array.
*/
public class sortedArrayCubed {

	public static void main(String[] args) {
		int[] array = {-6, -4, 1, 2, 3, 5}; // should return [1, 4, 9, 16, 25, 36]
		sortedSquaredArray(array);
		
	}
	
	private static int[] sortedSquaredArray(int[] array) {
		int left = 0;
		int right = array.length -1;
		int[] result = new int[array.length];
		for(int i = array.length-1; i>=0; i--) {
			if(Math.abs(array[left]) > array[right]) {
				result[i] = array[left] * array[left];
				left++;
			}else {
				result[i] = array[right] * array[right];
				right--;
			}
		}
		for(int i : result) {
			System.out.print(i + ", ");
		}
		return result;
		
	}

	

}


