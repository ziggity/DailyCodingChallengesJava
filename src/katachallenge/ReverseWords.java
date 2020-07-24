package katachallenge;

public class ReverseWords {

	public static void main(String[] args) {
		 final String TEXT = "My high school, the Illinois Mathematics and Science Academy, "
		            + "showed me that anything is possible and that you're never too young to think big. "
		            + "At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, "
		            + "or Fermilab. After graduating, I attended Stanford for a degree in economics and "
		            + "computer science.";
		 System.out.println(reverseWords(TEXT));
	}

	private static String reverseWords(String TEXT) {
		StringBuilder words = new StringBuilder();
		return words.reverse().toString();
		
	}

}
