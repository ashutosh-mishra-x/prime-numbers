package com.ubs.prime.primeNumber.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ubs.prime.primeNumber.Beans.PrimeNumber;
import com.ubs.prime.primeNumber.Service.PrimeNumberServices;


@RestController
public class PrimeNumberController {

	@Autowired
	PrimeNumberServices service;
	
	@GetMapping("primes/{num}")
	public ResponseEntity<PrimeNumber> getPrimeNumbers(@PathVariable int num) {
		PrimeNumber obj = service.getAllPrimes(num);
		//return service.getAllPrimes(num);
		return new ResponseEntity<PrimeNumber>(obj, HttpStatus.OK);
	}
}
