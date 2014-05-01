package kata_roman_number;

public class RomanNumber {

	public static String convert(int number) {
		StringBuilder result = new StringBuilder();
		int remain = number;

		remain = append(remain, 9, "IX", result);
		remain = append(remain, 5, "V", result);
		remain = append(remain, 4, "IV", result);

		for (int i = 0; i < remain; i++) {
			result.append("I");
		}

		return result.toString();
	}

	private static int append(int number, int value, String roman, StringBuilder result) {
		int remain = number;
		if (number >= value) {
			result.append(roman);
			remain = remain - value;
		}
		return remain;
	}
}
