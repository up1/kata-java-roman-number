package kata_roman_number;

public class RomanNumber {
	
	static int[] value = {9, 5, 4};
	static String[] roman = {"IX", "V", "IV"};

	public static String convert(int number) {
		StringBuilder result = new StringBuilder();
		int remain = number;
		
		for(int i=0; i<value.length; i++) {
			remain = append(remain, value[i], roman[i], result);
		}
		
		while(remain >= 1) {
			result.append("I");
			remain = remain -1;
		}

		return result.toString();
	}

	private static int append(int number, int value, String roman, StringBuilder result) {
		int remain = number;
		while (remain >= value) {
			result.append(roman);
			remain = remain - value;
		}
		return remain;
	}
}
