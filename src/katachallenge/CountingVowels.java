package katachallenge;

import java.util.concurrent.TimeUnit;

public class CountingVowels {

	private static final String TEXT = "Can curiosity may end shameless explained. True high on said mr on come. An do mr design at little myself wholly entire though. Attended of on stronger or mr pleasure. Rich four like real yet west get. Felicity in dwelling to drawings. His pleasure new steepest for reserved formerly disposed jennings. \n" + 
			"\n" + 
			"By an outlived insisted procure		d improved am. Paid hill fine ten now love even leaf. Supplied feelings mr of dissuade recurred no it offering honoured. Am of of in collecting devonshire favourable excellence. Her sixteen end ashamed cottage yet reached get hearing invited. Resources ourselves sweetness ye do no perfectly. Warmly warmth six one any wisdom. Family giving is pulled beauty chatty highly no. Blessing appetite domestic did mrs judgment rendered entirely. Highly indeed had garden not. \n" + 
			"\n" + 
			"Speedily say has suitable disposal add boy. On forth doubt miles of child. Exercise joy man children rejoiced. Yet uncommonly his ten who diminution astonished. Demesne new manners savings staying had. Under folly balls death own point now men. Match way these she avoid see death. She whose drift their fat off. \n" + 
			"\n" + 
			"Am if number no up period regard sudden better. Decisively surrounded all admiration and not you. Out particular sympathize not favourable introduced insipidity but ham. Rather number can and set praise. Distrusts an it contented perceived attending oh. Thoroughly estimating introduced stimulated why but motionless. \n" + 
			"\n" + 
			"Mr do raising article general norland my hastily. Its companions say uncommonly pianoforte favourable. Education affection consulted by mr attending he therefore on forfeited. High way more far feet kind evil play led. Sometimes furnished collected add for resources attention. Norland an by minuter enquire it general on towards forming. Adapted mrs totally company two yet conduct men. \n" + 
			"\n" + 
			"She who arrival end how fertile enabled. Brother she add yet see minuter natural smiling article painted. Themselves at dispatched interested insensible am be prosperous reasonably it. In either so spring wished. Melancholy way she boisterous use friendship she dissimilar considered expression. Sex quick arose mrs lived. Mr things do plenty others an vanity myself waited to. Always parish tastes at as mr father dining at. \n" + 
			"\n" + 
			"Am increasing at contrasted in favourable he considered astonished. As if made held in an shot. By it enough to valley desire do. Mrs chief great maids these which are ham match she. Abode to tried do thing maids. Doubtful disposed returned rejoiced to dashwood is so up. \n" + 
			"\n" + 
			"Chapter too parties its letters nor. Cheerful but whatever ladyship disposed yet judgment. Lasted answer oppose to ye months no esteem. Branched is on an ecstatic directly it. Put off continue you denoting returned juvenile. Looked person sister result mr to. Replied demands charmed do viewing ye colonel to so. Decisively inquietude he advantages insensible at oh continuing unaffected of. \n" + 
			"\n" + 
			"Fat son how smiling mrs natural expense anxious friends. Boy scale enjoy ask abode fanny being son. As material in learning subjects so improved feelings. Uncommonly compliment imprudence travelling insensible up ye insipidity. To up painted delight winding as brandon. Gay regret eat looked warmth easily far should now. Prospect at me wandered on extended wondered thoughts appetite to. Boisterous interested sir invitation particular saw alteration boy decisively. \n" + 
			"\n" + 
			"Up branch to easily missed by do. Admiration considered acceptance too led one melancholy expression. Are will took form the nor true. Winding enjoyed minuter her letters evident use eat colonel. He attacks observe mr cottage inquiry am examine gravity. Are dear but near left was. Year kept on over so as this of. She steepest doubtful betrayed formerly him. Active one called uneasy our seeing see cousin tastes its. Ye am it formed indeed agreed relied piqued.  today there was a fluffy rabbit who ran to the woods near my house who ate my homework";
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
