package com.ubs.prime.primeNumber.Beans;

import java.util.ArrayList;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="All field details of Prime Number")
public class PrimeNumber {

	@ApiModelProperty(notes="Values send by the user to calculate the prime number")  
	private int initials;
	
	@ApiModelProperty(notes="Contains all the prime numbers")  
	private ArrayList<Integer> priimes;
	

	public int getInitials() {
		return initials;
	}

	public void setInitials(int initials) {
		this.initials = initials;
	}

	public ArrayList<Integer> getPriimes() {
		return priimes;
	}

	public void setPriimes(ArrayList<Integer> priimes) {
		this.priimes = priimes;
	}

	public PrimeNumber() {
	}

	public PrimeNumber(int primeNum, ArrayList<Integer> primeList) {
		super();
		this.initials = primeNum;
		this.priimes = primeList;
	}

	@Override
	public String toString() {
		return "PrimeNumber [primeNum=" + initials + ", primeList=" + priimes + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((priimes == null) ? 0 : priimes.hashCode());
		result = prime * result + initials;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrimeNumber other = (PrimeNumber) obj;
		if (priimes == null) {
			if (other.priimes != null)
				return false;
		} else if (!priimes.equals(other.priimes))
			return false;
		if (initials != other.initials)
			return false;
		return true;
	}

}
