package kata_roman_number;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumberTest {

	@Test
	public void oneTwo() {
		assertEquals("I", RomanNumber.convert(1));
		assertEquals("II", RomanNumber.convert(2));
	}

}
