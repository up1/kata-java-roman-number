package kata_roman_number;

public class RomanNumber {

	public static String convert(int number) {
		StringBuilder result = new StringBuilder();
		
		if(number == 4) {
			return "IV";
		}
		
		for(int i=0; i< number; i++) {
			result.append("I");
		}
		return result.toString();
	}

}
