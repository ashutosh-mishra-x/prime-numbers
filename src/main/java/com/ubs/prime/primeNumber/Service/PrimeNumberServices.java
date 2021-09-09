package com.ubs.prime.primeNumber.Service;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.ubs.prime.primeNumber.Beans.PrimeNumber;

@Component
public class PrimeNumberServices {

	
	public PrimeNumber getAllPrimes(int num) {
		PrimeNumber primes = new PrimeNumber();
		primes.setInitials(num);
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		for (int i = 2; i <= num; i++)
		{
		    if(isPrime(i))
		    	primeList.add(i);
		        
		}
		primes.setPriimes(primeList);
		return primes;
	}
	
	private boolean isPrime(int number) {
		
	    if (number <= 1)
	        return false;
	    
	    if (number <= 3)
	        return true;
	 
	    if (number % 2 == 0 || number % 3 == 0)
	        return false;
		
	    for(int i=5; i*i <= number; i=i+6) {
			if(number % i ==0 || number % (i + 2) == 0)
				return false;
		}
		return true;
	}
}
