package com.kareem.kaushal;

import com.kareem.kaushal.model.AroojRequest;
import com.kareem.kaushal.model.PaytmModelResponse;
import com.kareem.kaushal.repo.ReadingListRepository;
import com.kareem.kaushal.service.MainService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class KaushalApplicationTests {


	@Test
	void contextLoads() {
	}
	@Autowired
	MainService mainService;


	@Test
	void HomeControllerMain(){
		AroojRequest a = new AroojRequest();
		a.setName("kaushal");
		a.setSuccess("asdasd");
		a.setPlace("Rishikesh");

		PaytmModelResponse add =mainService.response(a);
		assertEquals("kaushal", add.getCustomerName());
		assertEquals("Apki payment agyi he", add.getSuccess());
		assertEquals(1234124,add.getUpi());

	}




}
