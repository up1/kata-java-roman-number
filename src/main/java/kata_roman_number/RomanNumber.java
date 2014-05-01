package kata_roman_number;

public class RomanNumber {

	public static String convert(int number) {
		StringBuilder result = new StringBuilder();
		if (number >= 5) {
			result.append("V");
			number = number - 5;
		} else if (number == 4) {
			result.append("IV");
			number = number - 4;
		}
		for (int i = 0; i < number; i++) {
			result.append("I");
		}

		return result.toString();
	}

}
