package kata_roman_number;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumberTest {

	@Test
	public void oneTwoThree() {
		assertEquals("I", RomanNumber.convert(1));
		assertEquals("II", RomanNumber.convert(2));
		assertEquals("III", RomanNumber.convert(3));
	}
	
	@Test
	public void four() throws Exception {
		assertEquals("IV", RomanNumber.convert(4));
	}
	
	@Test
	public void five() throws Exception {
		assertEquals("V", RomanNumber.convert(5));
	}

}
