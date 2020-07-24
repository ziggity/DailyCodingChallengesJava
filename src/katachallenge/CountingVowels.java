package katachallenge;

import java.util.concurrent.TimeUnit;

public class CountingVowels {

	private static final String TEXT = "today there was a fluffy rabbit who ran to the woods near my house who ate my homework";
	static char ch2 = 'o';
	
	public static void main(String[] args) {
		 
		long startTimeV1 = System.nanoTime();
		System.out.println(countThisCharacter("For loop " + TEXT, ch2));
		displayExecutionTime(System.nanoTime()-startTimeV1);
		long startTimeV2 = System.nanoTime();
		System.out.println(countThisCharLambda("lambda " + TEXT, ch2));
		displayExecutionTime(System.nanoTime()-startTimeV2);

	}
//functional style
	private static long countThisCharLambda(String text2, char ch2) {
		return text2.chars().filter(c -> c == ch2).count();
	}

	private static int countThisCharacter(String text2, Character ch2) {
		int counter = 0;
		for(int i = 0; i < text2.length(); i++) {
			if(text2.charAt(i) == ch2) counter++;
		}
		return counter;
	}
	private static void displayExecutionTime(long time) {
        System.out.println("Execution time: " + time + " ns" + " (" +
                TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS) + " ms)");
    }
}
