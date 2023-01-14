package com.example.springdeploy;

import org.junit.jupiter.api.Test;

import static java.lang.System.*;
import static java.lang.System.getenv;

// @SpringBootTest
class SpringDeployApplicationTests {

	@Test
	void contextLoads() {
		System.getenv().forEach(
				(key, value) -> System.out.println(key + " " + value)
		);
	}

}
