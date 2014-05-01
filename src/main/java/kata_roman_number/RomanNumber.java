package kata_roman_number;

public class RomanNumber {

	public static String convert(int number) {
		StringBuilder result = new StringBuilder();
		if (number == 5) {
			result.append("V");
		} else if (number == 4) {
			result.append("IV");
		} else {
			for (int i = 0; i < number; i++) {
				result.append("I");
			}
		}
		return result.toString();
	}

}
