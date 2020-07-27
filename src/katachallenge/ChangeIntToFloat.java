package katachallenge;

public class ChangeIntToFloat {
	
	public static void main(String[] args) {
		final String TO_INT = "453"; 
		final String TO_LONG = "45234223233"; 
		final String TO_FLOAT = "45.823F";
		final String TO_DOUBLE = "13.83423D";
		
		int toInt = Integer.parseInt(TO_INT);
		long toLong = Long.parseLong(TO_LONG);
		float toFloat = Float.parseFloat(TO_FLOAT);
		double toDouble = Double.parseDouble(TO_DOUBLE);
		System.out.println(TO_INT + " " + TO_LONG + " " + TO_DOUBLE);
		String WRONG_NUMBER = "532w";
		try {
			  Integer toIntWrong1 = Integer.valueOf(WRONG_NUMBER);
			} catch (NumberFormatException e) {
			  System.err.println(e);
			  // handle exception
			}

			try {
			  int toIntWrong2 = Integer.parseInt(WRONG_NUMBER);
			} catch (NumberFormatException e) {
			  System.err.println(e);
			  // handle exception
			}
	}
}
