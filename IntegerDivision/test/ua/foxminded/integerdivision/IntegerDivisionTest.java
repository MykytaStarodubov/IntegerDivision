package ua.foxminded.integerdivision;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class IntegerDivisionTest {

	@Test
	void shouldThrowExceptionWhenDivisorIsZero() {
		assertThrows(IllegalArgumentException.class, () -> new IntegerDivision(10, 0));
	}

}