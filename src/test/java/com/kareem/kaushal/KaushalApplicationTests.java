package com.kareem.kaushal;

import com.kareem.kaushal.controller.HomeController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KaushalApplicationTests {


	@Test
	void contextLoads() {
	}
	HomeControllerTest b = new HomeControllerTest();

	@Test
	void HomeControllerMain(){
		b.TestController();
	}



}
