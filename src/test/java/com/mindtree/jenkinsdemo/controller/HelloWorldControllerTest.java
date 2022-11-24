package com.mindtree.jenkinsdemo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloWorldControllerTest {

	@Test
	public void helloTest() {
		HelloWorldController r = new HelloWorldController();
		assertEquals("Hello World!!!", r.hello());
	}
}
