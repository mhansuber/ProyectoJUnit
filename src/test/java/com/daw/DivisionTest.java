package com.daw;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DivisionTest {

	@BeforeEach
	public void setUp() throws Exception {}

	@AfterEach
	public void tearDown() throws Exception {}

	@Test
	public void testDivision() {
		double resultado = Division.division(3, 2);
		assertTrue(resultado==1.78);
	}

}
