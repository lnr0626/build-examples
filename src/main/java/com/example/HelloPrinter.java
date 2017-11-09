package com.example;

public class HelloPrinter {
	public String greet(String name) {
		return String.format("Hello, %s!", name == null ? "World" : name);
	}
}