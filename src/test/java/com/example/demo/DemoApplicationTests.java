package com.example.demo;

import com.example.demo.service.BonusCalcService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {


	BonusCalcService service = new BonusCalcService();

	@Test
	void contextLoads() {

		Assertions.assertEquals(service.calculateBonus(0), 0);
		Assertions.assertEquals(service.calculateBonus(-1), 0);
		Assertions.assertEquals(service.calculateBonus(49), 0);
		Assertions.assertEquals(service.calculateBonus(50), 0);
		Assertions.assertEquals(service.calculateBonus(51), 1);
		Assertions.assertEquals(service.calculateBonus(99), 49);
		Assertions.assertEquals(service.calculateBonus(100), 50);
		Assertions.assertEquals(service.calculateBonus(101), 52);
		Assertions.assertEquals(service.calculateBonus(120), 90);

	}

}
