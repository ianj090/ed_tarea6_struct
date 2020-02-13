package com.tarea6.tarea6;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Tarea6ApplicationTests {

	tarea6 Test = new tarea6();
	@Test
	void contextLoads() {
		Test.setValues(5,4);
		assertEquals("Quadrant 1", Test.findQuadrant());
		Test.setValues(-5,4);
		assertEquals("Quadrant 2", Test.findQuadrant());
		Test.setValues(-5,-4);
		assertEquals("Quadrant 3", Test.findQuadrant());
		Test.setValues(5,-4);
		assertEquals("Quadrant 4", Test.findQuadrant());
	}

}
