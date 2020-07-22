package katachallenge;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class CountDuplicatesInString {

		public static void main(String ...args) {
			final String TEXT = "Be strong, be fearless, be beautiful. "
		            + "And believe that anything is possible when you have the right "
		            + "people there to support you. ";
			 long startTimeV2 = System.nanoTime();
		System.out.println(countDuplicates(TEXT));
		 displayExecutionTime(System.nanoTime()-startTimeV2);

		}
		//Count Duplicate Characters in String: 
		//lowercase input first thing. 2nd thing is to get rid of the white spaces. Create a hashmap of all values, add to 
		//+1 to duplicates if values in map are greater than 1. 
		
		public static int countDuplicates(String TEXT) {
			int duplicates = 0; 
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			TEXT = TEXT.toLowerCase().replaceAll("[,.\\s]", "");
			TEXT.toCharArray();
			
			for(int i = 0; i<TEXT.length(); i++) {
				if(map.containsKey(TEXT.charAt(i))) {
					map.put(TEXT.charAt(i), map.get(TEXT.charAt(i))+1);
					duplicates++;
				}else {
					map.put(TEXT.charAt(i), 1);
				}
			}
//this method simple one liner will do what the forloop does: map.compute(key, (k, v) -> (v == null) ? 1 : v+1)
			System.out.println(map.keySet());
			return duplicates;
		}
		
		private static void displayExecutionTime(long time) {
	        System.out.println("Execution time: " + time + " ns" + " (" +
	                TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS) + " ms)");
	    }
}
