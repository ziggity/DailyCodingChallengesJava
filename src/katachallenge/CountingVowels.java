package katachallenge;

import java.util.concurrent.TimeUnit;

public class CountingVowels {

	private static final String TEXT = "today there was a fluffy rabbit who ran to the woods near my house who ate my homework";
	static char ch2 = 'o';
	
	public static void main(String[] args) {
		 
		long startTimeV1 = System.nanoTime();
		System.out.println(countThisCharacter( TEXT, ch2));
		displayExecutionTime(System.nanoTime()-startTimeV1);
		long startTimeV2 = System.nanoTime();
		System.out.println(countThisCharLambda( TEXT, ch2));
		displayExecutionTime(System.nanoTime()-startTimeV2);

	}
//functional style
	private static long countThisCharLambda(String text2, char ch2) {
		System.out.println("lambda functional!");

		return text2.chars().filter(c -> c == ch2).count();
	}

	private static int countThisCharacter(String text2, Character ch2) {
		int counter = 0;
		for(int i = 0; i < text2.length(); i++) {
			if(text2.charAt(i) == ch2) counter++;
		}
		System.out.println("forloop!");
		return counter;
	}
	private static void displayExecutionTime(long time) {
        System.out.println("Execution time: " + time + " ns" + " (" +
                TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS) + " ms)");
    }
}
