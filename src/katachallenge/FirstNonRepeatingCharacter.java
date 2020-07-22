package katachallenge;

import java.util.LinkedHashMap;
import java.util.Map;

/* Clean the text string first, remove ',.! etc. Lowercase it. 
 * LinkedHashMap method: insertion - order map which means it maintains the order in which the keys were 
 * inserted into the map. 
 * 
 */
public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		
		final String TEXT = "My high school, the Illinois Mathematics and Science Academy, "
	            + "showed me that anything is possible and that you're never too young to think big. "
	            + "At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, "
	            + "or Fermilab. After graduating, I attended Stanford for a degree in economics and "
	            + "computer science.";
		System.out.println(firstNonRepeatingChar(TEXT));
	}

	private static Character firstNonRepeatingChar(String str) {
		str = str.replaceAll("[',.!\\s]", "").toLowerCase();
		Map<Character, Integer> chars = new LinkedHashMap<Character, Integer>();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			chars.compute(ch, (k,v) -> (v == null) ? 1 : ++v);
			//System.out.println("ch: " + ch);
		}
		for (Map.Entry<Character, Integer> entry: chars.entrySet()) {
			System.out.println(entry.getValue() + " "+ entry.getKey());
			if(entry.getValue() ==1) {
				return entry.getKey();
				
			}
		}
		
		return Character.MIN_VALUE;
	}
}
