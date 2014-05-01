package kata_roman_number;

public class RomanNumber {

	public static String convert(int number) {
		StringBuilder result = new StringBuilder();
		int remain = number;
		if (number == 9) {
			result.append("IX");
			remain = number - 9;
		} else if (number >= 5) {
			result.append("V");
			remain = number - 5;
		} else if (number == 4) {
			result.append("IV");
			remain = number - 4;
		}
		for (int i = 0; i < remain; i++) {
			result.append("I");
		}

		return result.toString();
	}

}
