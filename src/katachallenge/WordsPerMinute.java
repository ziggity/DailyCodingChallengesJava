package katachallenge;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WordsPerMinute {

	public static void main(String[] args) throws InterruptedException {
		testYourWordsPerMin();

	}
	static String[] words = {"summary", "remember", "edge", "scales", "rabbits", "totally", "obtuse", "sports", "history", "competition"};
	public static String randomWords = "";
	
	 static void testYourWordsPerMin() throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		System.out.println("3");
		TimeUnit.MICROSECONDS.sleep(1);
		System.out.println("2");
		TimeUnit.MICROSECONDS.sleep(1);
		System.out.println("1");
		TimeUnit.MICROSECONDS.sleep(1);
		Random rand = new Random();
		for(int i = 0; i < 1; i++) {
			String word = words[rand.nextInt(1)];
			randomWords += word + " ";
			System.out.print(word + " ");
		}
		
		System.out.println();
		double start = LocalTime.now().toNanoOfDay();
		String typedWords = scan.nextLine();
		double end = LocalTime.now().toNanoOfDay();
		double elapsedTime = end - start;
		double seconds = elapsedTime / 1000000000.0;
		int numChars = typedWords.length();
		int wpm = (int) ((((double) numChars / 5) / seconds) * 60);
		int accuracy = 0;
		
		System.out.println("your wpm is " + wpm + "and your accuracy is " + checkAccuracy(typedWords));
		System.out.println(typedWords);
		
	}
	 //can't get this working properly
	 static int checkAccuracy(String typedWords) {
			if(typedWords.isEmpty()) return 0;
			System.out.println(randomWords.getClass().getName());
			if(typedWords instanceof String) return 99;
			if(typedWords.contentEquals(randomWords))return 100;
			return -1;

		}

}
