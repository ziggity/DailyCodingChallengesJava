package katachallenge;

public class RemoveWhiteSpaces {
	public static void main(String...strings) {
		System.out.println(removeWhitespaces("hello world"));
	}
	
	public static String removeWhitespaces(String str) {
		  return str.replaceAll("\\s", "");
		}
}
