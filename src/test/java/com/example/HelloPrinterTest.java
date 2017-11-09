package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloPrinterTest {
	@Test
	public void testPrinter() {
		assertEquals("Hello, World!", new HelloPrinter().greet(null));
	}
}