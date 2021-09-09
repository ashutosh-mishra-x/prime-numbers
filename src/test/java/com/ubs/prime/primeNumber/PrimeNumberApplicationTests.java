package com.ubs.prime.primeNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ubs.prime.primeNumber.Beans.PrimeNumber;
import com.ubs.prime.primeNumber.Service.PrimeNumberServices;

@SpringBootTest
class PrimeNumberApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void primeNumberTest() {
		PrimeNumber pm = new PrimeNumber();
		pm.setInitials(10);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(7);
		pm.setPriimes(list);
		PrimeNumberServices pns = new PrimeNumberServices();
		assertEquals(pm, pns.getAllPrimes(10));
	}
}
