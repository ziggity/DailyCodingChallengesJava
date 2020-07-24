package katachallenge;

public class ContainsOnlyDigits {

	public static void main(String[] args) {
		 final String ONLYDIGITS = "45566336754493420932877387482372374982374823"
		            + "749823283974232237238472392309230923849023848234580383485342234287943943094"
		            + "234745374657346578465783467843653748654376837463847654382382938793287492326";
		 System.out.println(containsOnlyDigits(ONLYDIGITS));
	}

	private static boolean containsOnlyDigits(String str) {
		 for (int i = 0; i < str.length(); i++) {
	            if (!Character.isDigit(str.charAt(i))) {
	                return false;
	            }
	        }
		return true;
	}

}
