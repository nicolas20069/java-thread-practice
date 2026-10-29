package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class DemoApplicationTests {

	@Test
	void procesosTerminan() throws InterruptedException {
		Thread primero = new Proceso_1();
		Thread segundo = new Proceso_2();

		primero.start();
		segundo.start();
		primero.join(2000);
		segundo.join(2000);

		assertFalse(primero.isAlive());
		assertFalse(segundo.isAlive());
	}

}
