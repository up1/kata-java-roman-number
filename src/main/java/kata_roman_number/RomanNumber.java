package kata_roman_number;

public class RomanNumber {

	public static String convert(int number) {
		StringBuilder result = new StringBuilder();
		if(number == 2) result.append("I");
		result.append("I");
		return result.toString();
	}

}
